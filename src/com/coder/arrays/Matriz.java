package com.coder.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos");
        int qtdAlunos = entrada.nextInt(); //linha

        System.out.println("Quantas notas por alunos");
        int qtdNotas = entrada.nextInt(); //coluna

        //matriz[linha][coluna]
        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
        double notaTotal = 0;
        for (int i = 0; i < notasDaTurma.length; i++){
            for (int j = 0; j < notasDaTurma[i].length; j++){
                System.out.printf("Informe a nota %d do aluno %d: ", (j+1), (i+1));

                notasDaTurma[i][j] = entrada.nextDouble();
                notaTotal += notasDaTurma[i][j];
            }
        }

        double media = notaTotal/(qtdAlunos*qtdNotas);
        System.out.println("Media da turma e " + media);

        for (double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }


}
