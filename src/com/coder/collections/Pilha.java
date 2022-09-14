package com.coder.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
    Deque<String> pilhaDeLivros = new ArrayDeque<>();
    pilhaDeLivros.add("Harry Potter e a Pedra Filosofal");
    pilhaDeLivros.push("Harry Potter e a Camara Secreta");
    pilhaDeLivros.push("Harry Potter e o Prisioneiro de Azkaban");
    //pilhaDeLivros.push("Harry Potter e o Calice de Fogo");
    //pilhaDeLivros.add("Harry Potter e a Ordem da Fenix");
   //pilhaDeLivros.push("Harry Potter e o Enigma do Principe");
    //pilhaDeLivros.add("Harry Potter e as Reliquias da Morte");

        for (String livro: pilhaDeLivros) {
            System.out.print(livro + "... ");
        }

        System.out.println();

        System.out.println(pilhaDeLivros.peek());
        System.out.println(pilhaDeLivros.element());

    }

}
