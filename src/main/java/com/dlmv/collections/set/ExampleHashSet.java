package com.dlmv.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {

        Set<Double> studentsScores = new HashSet<>();
        studentsScores.add(5.6);
        studentsScores.add(9.1);
        studentsScores.add(7.5);
        studentsScores.add(10d);
        studentsScores.add(4.9);
        studentsScores.add(7d);
        studentsScores.add(2.1);
        studentsScores.add(3d);
        System.out.println(studentsScores);

        studentsScores.remove(4.9);
        System.out.println("Tamanho da lista de notas dos alunos: " + studentsScores.size());

        Iterator<Double> iteratorStudentsScores = studentsScores.iterator();
        while(iteratorStudentsScores.hasNext()){
            System.out.println(iteratorStudentsScores.next());
        }
        for (Double scores:
                studentsScores) {
            System.out.println(scores);
        }

        studentsScores.clear();
        System.out.println("A lista de nostas está vazia? " + studentsScores.isEmpty());

    }
}
