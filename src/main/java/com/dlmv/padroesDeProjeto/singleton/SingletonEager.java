package com.dlmv.padroesDeProjeto.singleton;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }

}
