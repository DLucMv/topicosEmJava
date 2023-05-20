package com.dlmv.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> students = new Hashtable<>();
        students.put("Carlos", 21);
        students.put("Mariana", 33);
        students.put("Rafaela", 18);
        students.put("Pedro", 44);
        System.out.println(students);

        students.put("Pedro", 55);
        System.out.println(students);
        students.remove("Pedro");
        System.out.println(students);

        System.out.println("Qual a idade de Mariana? " + students.get("Mariana"));
        System.out.println("Qual o tamanho do nosso mapa? " + students.size());

        System.out.println();
        for (Map.Entry<String, Integer> entry:
                students.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }
        for (String student : students.keySet()){
            System.out.println(student + " tem " + students.get(student) + " anos.");
        }

    }
}
