package com.dlmv.collections.set;

import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();
        treeCapitals.add("Port Alegre");
        treeCapitals.add("Florianópolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        System.out.println(treeCapitals);

        System.out.println("Qual a primeira capital (Topo da árvore)?" + treeCapitals.first());
        System.out.println("Qaual o última capitas ('Ultima Folha')?" + treeCapitals.last());
        System.out.println("Retorna a primeira capital abaixo na árvore da capital parametrizada:"
                + treeCapitals.lower("Florianópolis"));
        System.out.println("Retorna a primeira capital acima na árvore da capital parametrizada:"
                + treeCapitals.higher("Florianópolis"));

        //Retorna a primeira capital no topo da árvore, removendo-a do Set
        System.out.println(treeCapitals.pollFirst());
        //Retorna a primeira capital no final da árvore, removendo-a do Set
        System.out.println(treeCapitals.pollLast());
        System.out.println(treeCapitals);

    }
}
