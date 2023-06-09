package org.lessons.java.christmas;

//Import
import java.util.Arrays;

public class Ciclabile {

    //ATTRIBUTI
    private int[] numbers;
    private int pointer;

    //COSTRUTTORE
    //senza parametri
    public Ciclabile() {
        this.pointer = 0;
    }
    //con parametri
    public Ciclabile(int[] numbers) {
        this.numbers = numbers;
        this.pointer = 0;
    }

    //METODI
    public int getElementoSuccessivo() throws RuntimeException{
        //se non ho raggiunto la fine della lista
        if(hasAncoraElementi()) {
            //aumento il contatore
            pointer++;
            //restituisco l'elemento della lista a cui puntava il pointer
            return numbers[pointer - 1];
        } else {
            //altrimenti lancio un'eccezione
            throw new RuntimeException("Hai raggiunto la fine della lista");
        }
    }

    public boolean hasAncoraElementi() {
        return pointer < numbers.length;
    }

    public void addElemento(int num) {
        //se l'array non è ancora inizializzato
        if(numbers == null) {
            numbers = new int[1];
            numbers[0] = num;
        } else {
            //creo un array più lungo
            int[] newNumbers = new int[numbers.length+1];
            //metto nel nuovo array gli elementi del vecchio
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers [i];
            }
            //metto per ultimo il nuovo elemento
            newNumbers[numbers.length] = num;
            //sovrascrivo l'array
            numbers = newNumbers;
        }
    }

    @Override
    public String toString() {
        return "Ciclabile{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
