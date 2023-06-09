package org.lessons.java.christmas;

//IMPORT
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Apro lo scanner
        Scanner scan = new Scanner(System.in);

        //creo il percorso del file
        File wishListFile = new File("./wishlist.txt");

        //------------------------ CREO LA LISTA ------------------------
        List<String> wishList = new ArrayList<>();


        //------------------------ EVENTUALMENTE RECUPERO LA LISTA SALVATA ------------------------

        //se esiste il file wishlist
        if(wishListFile.exists()) {

            //creo un reader
            try (Scanner reader = new Scanner(wishListFile)) {
                while(reader.hasNext()) {
                    //salvo la riga nella lista wishList
                    wishList.add(reader.next());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Il file non c'è");
            }

            //se la lista non è vuota
            if(!wishList.isEmpty()) {
                //stampo la wishlist
                System.out.println("Hai una wishlist salvata");
                System.out.println("Contiene: " + wishList);
            }

        }


        //------------------------ ALIMENTO LA LISTA ------------------------

        System.out.println("------ Iniziamo ad inserire i regali! ------");

        //variabile per uscire dal loop
        boolean stop = false;
        do {
            //chiedo il regalo
            System.out.print("Nome del regalo: ");
            String present = scan.nextLine();

            //inserisco il regalo nella lista
            wishList.add(present);

            //mostro la lunghezza della lista
            System.out.println("Ora la tua wishlist contiene " + wishList.size() + " regali.");

            System.out.println("--------------------------------------");

            //chiedo se si vuole terminare
            String answer;
            do {
                System.out.println("Vuoi fermarti? s/n");
                answer = scan.nextLine();
                if(!answer.equalsIgnoreCase("s") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Rispondi 's' o 'n' !");
                }
            } while (!answer.equalsIgnoreCase("s") && !answer.equalsIgnoreCase("n"));
            //in base alla risposta cambio lo stato di stop
            stop = answer.equalsIgnoreCase("s");

        } while(!stop);


        //------------------------ ORDINO E STAMPO LA LISTA ------------------------

        //ordino la lista
        Collections.sort(wishList);

        //stampo la lista
        System.out.println("La tua wishlist contiene:");
        System.out.println(wishList);


        //------------------------ SALVO LA LISTA SU UN FILE ------------------------

        //creo un writer
        try (FileWriter writer = new FileWriter(wishListFile)) {
            //stampo la lista nel file
            for (int i = 0; i < wishList.size(); i++) {
                writer.write(wishList.get(i) + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //Chiudo lo scanner
        scan.close();

    }
}
