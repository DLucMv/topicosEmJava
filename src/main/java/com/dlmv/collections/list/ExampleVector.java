package com.dlmv.collections.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        //Adiciona 4 esports no vetor
        sports.add("Futebol");
        sports.add("Basquetebol");
        sports.add("Tênis de mesa");
        sports.add("Handbol");
        System.out.println(sports);

        sports.set(2, "Ping Pong");
        sports.remove("Handbol");
        System.out.println(sports);
        System.out.println("Qual o primeiro Esporte ? " + sports.get(0));

        int i = 0;
        for (String sport :
                sports) {
            System.out.println(++i + ". " + sport);
        }

    }
}
