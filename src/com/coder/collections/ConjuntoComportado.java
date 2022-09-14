package com.coder.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<>(); não ordenado
        Set<String> listaAprovados = new TreeSet<>(); //ordenado
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Mario");
        listaAprovados.add("Ludwig");
        listaAprovados.add("Joana");

        for (String canditado : listaAprovados){
            System.out.print(canditado + " ");
        }
        System.out.println();
        System.out.println(listaAprovados);

    }
}
