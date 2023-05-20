package com.dlmv.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Carlos");    //0
        names.add("Pedro");     //1
        names.add("Juliana");   //2
        names.add("Aline");     //3
        names.add("Maria");     //4
        names.add("João");      //5
        System.out.println(names);

        names.set(2,"Larissa");
        System.out.println(names);

        Collections.sort(names);
        names.set(2,"Wesley");
        System.out.println(names);

        names.remove(3);
        names.remove("Wesley");
        System.out.println(names);

        String name = names.get(1);
        System.out.println(name);

        System.out.println("Qual o indice do nome Calos? " + names.indexOf("Carlos"));
        System.out.println("E qual o indice do nome Wesley? " + names.indexOf("Wesley"));

        int length = names.size();
        System.out.println(length);

        names.remove("Maria");
        length = names.size();
        System.out.println("Tamanho da lista: " + length);

        System.out.println("Tem Aline? " + names.contains("Aline"));
        System.out.println("Tem Fernado? " + names.contains("Fernando"));
        System.out.println("A lista está vazia? " + names.isEmpty());

        for (String eachName : names) {
            System.out.println("-->" + eachName);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println("--->" + iterator.next());
        }

        names.clear();
        System.out.println("Agora a lista está vazia?" + names.isEmpty());
    }
}