package com.dlmv.collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleStudentsComparatorList {

    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();
        students.add(new Students("Pedro", 19));
        students.add(new Students("Carlos", 23));
        students.add(new Students("Mariana", 21));
        students.add(new Students("João", 18));
        students.add(new Students("Thiago", 20));
        students.add(new Students("George", 22));
        students.add(new Students("Larrissa", 21));
        System.out.println("--- Ordem de inserção ---");
        System.out.println(students);
        System.out.println();

        students.sort((Students first, Students second) ->first.getAge() - second.getAge());
        System.out.println("--- Ordem natural dos valores de idade ---");
        System.out.println(students);
        System.out.println();

        students.sort((first, second) -> second.getAge() - first.getAge());
        System.out.println("--- Ordem reversa dos valores de idade ---");
        System.out.println(students);
        System.out.println();

        students.sort(Comparator.comparingInt(Students::getAge));
        System.out.println("--- Ordem natural dos valores de idade (method reference) ---");
        System.out.println(students);
        System.out.println();

        students.sort(Comparator.comparingInt(Students::getAge).reversed());
        System.out.println("--- Ordem inversa dos valores de idade (method reference)---");
        System.out.println(students);
        System.out.println();

        Collections.sort(students);
        System.out.println("--- Ordem natural dos valores de idade (interface Comparable)---");
        System.out.println(students);
        System.out.println();

        Collections.sort(students, new StudentsReverseOrder());
        System.out.println("--- Ordem reversa dos valores de idade (interface Comparator)---");
        System.out.println(students);
        System.out.println();

    }

}
