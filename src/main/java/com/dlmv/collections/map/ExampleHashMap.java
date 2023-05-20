package com.dlmv.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {

        Map<String, Integer> fifaWorldChampions = new HashMap<>();
        fifaWorldChampions.put("Brasil" , 5);
        fifaWorldChampions.put("Alemenha" , 4);
        fifaWorldChampions.put("Itália" , 4);
        fifaWorldChampions.put("Uruguai" , 2);
        fifaWorldChampions.put("Argentina" , 2);
        fifaWorldChampions.put("França" , 2);
        fifaWorldChampions.put("Inglaterra" , 1);
        fifaWorldChampions.put("Espanha" , 1);
        System.out.println(fifaWorldChampions);

        fifaWorldChampions.put("Brasil" , 6);
        System.out.println("Quantas vitórias tem a argentina? " + fifaWorldChampions.get("Argentina"));
        System.out.println("Exite um campeão chamado França? " + fifaWorldChampions.containsKey("França"));
        System.out.println(fifaWorldChampions);

        fifaWorldChampions.remove("França");
        System.out.println(fifaWorldChampions);

        System.out.println("Existe alguma seleção que ganhou seis vezes? " + fifaWorldChampions.containsValue(6));
        System.out.println("Qual o tamanho do nosso mapa? " + fifaWorldChampions.size());


        for (Map.Entry<String, Integer> entry : fifaWorldChampions.entrySet()) {
            System.out.println(entry.getKey() + " ganhou " + entry.getValue() + " vezes o campeonato.");
        }
        for (String key:
                fifaWorldChampions.keySet()) {
            System.out.println(key + "--" + fifaWorldChampions.get(key));
        }

        fifaWorldChampions.clear();
        System.out.println(fifaWorldChampions);

    }
}