package org.lessons.java.christmas;

//IMPORT
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Apro lo scanner
        Scanner scan = new Scanner(System.in);

        //------------------------ CREO LA LISTA ------------------------
        List<String> wishList = new ArrayList<>();

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


        //Chiudo lo scanner
        scan.close();

    }
}
