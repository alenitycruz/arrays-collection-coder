package com.coder.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Queue<String> fila2 = new LinkedList<>();

        /*
            Diferença de comportamento ocorre
            quando a fila esta cheira
         */
        fila.add("Xango"); // retorna false
        fila.offer("Oxum"); // retorna exceção
        fila.add("Oxala");
        fila.offer("Iansa");
        fila.add("Iemanja");
        fila.offer("Ogum");

        for (String fi: fila ) {
            System.out.print(fi + " ");
        }

        System.out.println();

        //Peek e Element -> obtem o proximo elemento
        // da fila (sem remover)

        /*
            Diferenca de comportamento ocorre
            quando a fila esta vazia
         */

        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // retorna uma exceção
        System.out.println(fila.element());

        System.out.println(fila2.peek());

        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        //fila.clear();

        //Poll e Remove -> ambos imprimem e retiram o primeiro da fila
        // a diferença ocorre quando a fila esta vazia
        System.out.println(fila.poll()); //retorna null
        System.out.println(fila.remove()); // retorna uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.size());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
