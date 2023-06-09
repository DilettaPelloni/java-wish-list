package org.lessons.java.christmas;


public class MainCiclabile {
    public static void main(String[] args) {

        //ho una lista di numeri
        int[] numbers = {1,2,3,4};

        //creo un'istanza di ciclabile che contiene la mia lista di numeri
        Ciclabile myCiclabile = new Ciclabile(numbers);

        //la stampo
        System.out.println(myCiclabile.toString());


        //------------------ TESTO I METODI ------------------
        //stampo 5 volte il risultato del metodo
        for (int i = 0; i < 5; i++) {
            //uso un try catch perché ho previsto un'eccezione
            try {
                System.out.println(myCiclabile.getElementoSuccessivo());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            //stampo il risultato di hasAncoraElementi()
            System.out.println(myCiclabile.hasAncoraElementi());
        }


        //------------------ BONUS ------------------
        //istanzio Ciclabile con il costruttore senza parametri
        Ciclabile myNewCiclabile = new Ciclabile();

        //aggiungo elementi a myNewCiclabile
        for (int i = 0; i < 5; i++) {
            myNewCiclabile.addElemento(i+1);
        }

        //stampo myNewCiclabile
        System.out.println(myNewCiclabile);

        //testo i primi metodi anche qua
        for (int i = 0; i < 5; i++) {
            //uso un try catch perché ho previsto un'eccezione
            try {
                System.out.println(myNewCiclabile.getElementoSuccessivo());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            //stampo il risultato di hasAncoraElementi()
            System.out.println(myNewCiclabile.hasAncoraElementi());
        }
    }
}
