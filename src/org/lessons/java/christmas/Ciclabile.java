package org.lessons.java.christmas;

//IMPORT
import java.util.ArrayList;
import java.util.List;

public class Ciclabile {

    //ATTRIBUTI
    private int[] numbers;
    private int pointer;

    //COSTRUTTORE
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

    @Override
    public String toString() {
        return "Ciclabile{" +
                "numbers=" + numbers +
                '}';
    }
}
