package com.dlmv.dataStructures.binaryTree.application;

import com.dlmv.dataStructures.binaryTree.elements.ArvoreBinaria;
import com.dlmv.dataStructures.binaryTree.model.Obj;

public class Application {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> arvore = new ArvoreBinaria<>();

        arvore.insert(new Obj(13));
        arvore.insert(new Obj(10));
        arvore.insert(new Obj(25));
        arvore.insert(new Obj(2));
        arvore.insert(new Obj(12));
        arvore.insert(new Obj(20));
        arvore.insert(new Obj(31));
        arvore.insert(new Obj(29));

        arvore.exibirPreOrdem();
        System.out.println();

        arvore.exibirInOrdem();
        System.out.println();

        arvore.exibirPosOrdem();
        System.out.println();

        arvore.exibirFolhas();
        System.out.println();

        System.out.println(arvore.high());

        System.out.println(arvore.contarNos());

        System.out.println(arvore.extratamenteBinaria());


    }

}