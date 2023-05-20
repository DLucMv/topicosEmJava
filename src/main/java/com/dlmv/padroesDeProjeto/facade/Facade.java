package com.dlmv.padroesDeProjeto.facade;

import com.dlmv.padroesDeProjeto.subsistema1.crm.CrmService;
import com.dlmv.padroesDeProjeto.susistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }

}
