package com.dlmv.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {

        Queue<String> restaurantQueue = new LinkedList<>();

        restaurantQueue.add("Patrícia");
        restaurantQueue.add("Roberto");
        restaurantQueue.add("Flávio");
        restaurantQueue.add("Pamela");
        restaurantQueue.add("Anderson");
        System.out.println(restaurantQueue);

        String customerToBeServed = restaurantQueue.poll();
        System.out.println(customerToBeServed + ", foi servida e sai da fila.");
        System.out.println(restaurantQueue + " Esperam sua vez de serem atendidos");

        String firstCustomer = restaurantQueue.peek();
        System.out.println("Quem será o próximo cliente a ser atendido? " + firstCustomer);

        for (String client:
                restaurantQueue) {
            System.out.println("->" + client);
        }
        Iterator<String> iterator = restaurantQueue.iterator();
        while (iterator.hasNext()){
            System.out.println("-->" + iterator.next());
        }

        System.out.println("Tamanho da fila: " + restaurantQueue.size());
        System.out.println("A fila esta vazia? " + restaurantQueue.isEmpty());

        /*restaurantQueue.clear();
        String firstCustomerOrError = restaurantQueue.element();
        System.out.println(firstCustomerOrError);*/

    }
}
