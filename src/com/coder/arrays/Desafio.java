package com.coder.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas notas voce quer informar: ");
        int qtdNotas = scan.nextInt();

        double [] notas = new double[qtdNotas];

        for (int j = 0 ; j < notas.length ; j++){
            System.out.println("Nota " + j + ": ");
            notas[j] = scan.nextDouble();
        }

        System.out.println(Arrays.toString(notas));

        double total = 0;
        for (double nota: notas ) {
            total += nota;
        }

        System.out.println("Media das notas: " + (total/qtdNotas));
        scan.close();

    }
}
