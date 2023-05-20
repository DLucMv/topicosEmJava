package com.dlmv.dataStructures.binaryTree.elements;

public class BinNo<T extends Comparable<T>> {

    private T data;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T data){
        this.data = data;
        this.noEsq = null;
        this.noDir = null;
    }

    public BinNo(){
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public BinNo<T> getNoEsq(){
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq){
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir(){
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir){
        this.noDir = noDir;
    }

    @Override
    public String toString(){
        return "BinNo{" + "data= " + data + "}";
    }
}
