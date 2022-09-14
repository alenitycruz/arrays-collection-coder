package com.coder.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista {
    public static void main(String[] args) {
    ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Fernanda"));
        lista.add(new Usuario("Joana"));
        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Mario"));



        System.out.println(Arrays.toString(lista.stream().toArray()));

        System.out.println(lista.get(0).nome);
        lista.remove(2);

        for (Usuario u: lista) {
            System.out.print(u.nome + " ");
        }

        System.out.println();

        System.out.println(lista.remove(new Usuario("Fernanda")));

        for (Usuario u: lista) {
            System.out.print(u.nome + " ");
        }

        System.out.println();
        System.out.println("Tem ? " + lista.contains(new Usuario("Fernanda")));
        System.out.println("Tem ? " + lista.contains(new Usuario("Mario")));

    }

}
