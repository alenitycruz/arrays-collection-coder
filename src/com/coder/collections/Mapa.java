package com.coder.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Ricardo");
        usuarios.put(4, "Maria");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Maria"));

        System.out.println(usuarios.get(20));
        System.out.println(usuarios.get("Maria"));

        for (Integer num: usuarios.keySet()) {
            System.out.print(num + " ");
        }

        System.out.println();
        for (String nome: usuarios.values()) {
            System.out.print(nome + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, String> valor: usuarios.entrySet()) {
            System.out.print( valor + " ");
        }
    }
}
