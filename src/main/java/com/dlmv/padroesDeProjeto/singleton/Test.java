package com.dlmv.padroesDeProjeto.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstance();
        System.out.println(Eager);
        Eager = SingletonEager.getInstance();
        System.out.println(Eager);

        SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(LazyHolder);
        LazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(LazyHolder);
    }
}