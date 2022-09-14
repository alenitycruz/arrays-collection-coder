package com.coder.collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Maria Padilha"));
        usuarios.add(new Usuario("Dama da Noite"));
        usuarios.add(new Usuario("Maria Padilha"));

        System.out.println(usuarios.contains(new Usuario("Dama da Noite")));
        System.out.println(usuarios.contains(new Usuario("Exu")));
        System.out.println(usuarios);
    }
}
