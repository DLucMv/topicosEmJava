package com.dlmv.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitals= new TreeMap<>();
        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianópolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("BH", "Belo Horizonte");
        System.out.println(treeCapitals);

        System.out.println("Qual o primeiro estado (Topo da árvore)?" + treeCapitals.firstKey());
        System.out.println("Qual o último estado ('Ultima Folha')?" + treeCapitals.lastKey());
        System.out.println("Retorna o primeiro estado abaixo na árvore do estado parametrizado:"
                + treeCapitals.lowerKey("SC"));
        System.out.println("Retorna o primeiro estado acima na árvore do estado parametrizado:"
                + treeCapitals.higherKey("SC"));

        System.out.println("Qual a primeira capital no final da árvore? "
                + treeCapitals.firstEntry().getKey()
                + ", " + treeCapitals.firstEntry().getValue());
        System.out.println("Qual a última capital no final da árvore? "
                + treeCapitals.firstEntry().getKey()
                + ", " + treeCapitals.firstEntry().getValue());
        System.out.println("Qual a primeira capital abaixo na árvore da capital parametrizada? "
                + treeCapitals.lowerEntry("SC").getKey() + ", "
                + treeCapitals.lowerEntry("SC").getValue());
        System.out.println("Qual a primeira capital acima na árvore da capital parametrizada? "
                + treeCapitals.higherEntry("SC").getKey() + ", "
                + treeCapitals.higherEntry("SC").getValue());

        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();
        System.out.println(firstEntry.getKey() + ", " + firstEntry.getValue() + "\n"
                +lastEntry.getKey() + ", " + lastEntry.getValue());

        Iterator<String> iterator = treeCapitals.keySet().iterator();
        System.out.println();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + ", " + treeCapitals.get(key));
        }
        System.out.println();
        for (String capital : treeCapitals.keySet()){
            System.out.println(capital + ", " + treeCapitals.get(capital));
        }
        System.out.println();
        for (Map.Entry<String, String> entry :
                treeCapitals.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
