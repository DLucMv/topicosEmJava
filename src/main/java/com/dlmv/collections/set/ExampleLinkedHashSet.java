package com.dlmv.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<>();
        numericalSequence.add(1);
        numericalSequence.add(2);
        numericalSequence.add(4);
        numericalSequence.add(8);
        numericalSequence.add(16);
        numericalSequence.add(32);
        numericalSequence.add(64);
        System.out.println(numericalSequence);

        numericalSequence.remove(16);
        System.out.println("Qual o tamanho da sequência numérica? " + numericalSequence.size());
        Iterator<Integer> iteratorNumericalSequence = numericalSequence.iterator();
        while (iteratorNumericalSequence.hasNext()){
            System.out.println(iteratorNumericalSequence.next());
        }

        numericalSequence.clear();
        System.out.println("O conjunto está vazio? " + numericalSequence.isEmpty());

    }
}