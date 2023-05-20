package com.dlmv.collections.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExampleStreamAPI {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Pedro");
        students.add("Thayse");
        students.add("Marcelo");
        students.add("Carla");
        students.add("Juliana");
        students.add("Thiago");
        students.add("Rafael");

        System.out.println("Qual a contagem de elementos do stream: " + students.stream().count());
        System.out.println();

        System.out.println("Qual o elemento com o menor numero de letras? "
                + students.stream().max(Comparator.comparingInt(String::length)));
        System.out.println();

        System.out.println("Qual o elemento com o menor número de letras? "
                + students.stream().min(Comparator.comparingInt(String::length)));
        System.out.println();

        System.out.println("Que elemento/elemntos tem a letra r em seu nome? "
                + students.stream().filter((student) -> student.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Retorne um nova coleção com a quantidade de letras: "
                + students.stream()
                .map(student -> student.concat(" - ").concat(String.valueOf(student.length())))
                .collect(Collectors.toList()));
        System.out.println();

        System.out.println("Retorne os 3 primeiros elementos da coleção: "
                +students.stream().limit(3).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Exiba o cada elemento no console e depois retorne a mesma coleção: "
                + students.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Retorne todos os elementos no console novamente: ");
        students.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("Todos os elementos tem o W no nome? "
                + students.stream().allMatch((element) -> element.contains("W")));
        System.out.println();

        System.out.println("Algum elemento tem a letra a minúscula no nome? "
                + students.stream().anyMatch((element) -> element.contains("a")));
        System.out.println();

        System.out.println("Não tem nenhum elemento com a letra a minúscula no nome? "
                + students.stream().noneMatch((element) -> element.contains("a")));
        System.out.println();

        System.out.println("Qual o primeiro elemento da coleção? ");
        students.stream().findFirst().ifPresent(System.out::println);
        System.out.println();

        System.out.println("Exemplo de operação encadeada: ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student -> student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
                .filter(student -> student.toLowerCase().contains("r"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") + 1))));

    }

}
