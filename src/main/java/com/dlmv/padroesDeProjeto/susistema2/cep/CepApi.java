package com.dlmv.padroesDeProjeto.susistema2.cep;

public class CepApi {

    private static final CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Natal";
    }

    public String recuperarEstado(String cep){
        return "RN";
    }

}
