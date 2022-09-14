package com.coder.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));
        //também vale:
        //double notasAlunoA[] = new double[3];
        //ou
        //double []notasAlunoA = new double[3];
        //ou
        //double [] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        for (int i = 0 ; i < 3 ; i++){
            System.out.println(notasAlunoA[i]);
        }

        double totalA = 0;
        for (int j = 0; j < 3; j++){
            totalA += notasAlunoA[j];
        }
        System.out.println(totalA/notasAlunoA.length);

        final double notaArmazenada = 5.5;
        double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10.0};
        for (int i = 0 ; i < notasAlunoB.length ; i++) {
            System.out.println(notasAlunoB[i]);
        }

        double totalB = 0;
        for (int j = 0; j < notasAlunoB.length ; j++){
            totalB += notasAlunoB[j];
        }
        System.out.println(totalB/ notasAlunoB.length);
        System.out.println(notasAlunoB.length);

    }
}
