package com.dlmv.dataStructures.binaryTree.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj>{

    Integer myData;

    public Obj(Integer myData){
        this.myData = myData;
    }

    @Override
    public boolean equals(Object o){

        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Obj obj = (Obj) o;

        return Objects.equals(myData, obj.myData);

    }

    @Override
    public int hashCode(){

        return Objects.hash(myData);

    }

    @Override
    public int compareTo(Obj outro){

        int i = 0;

        if(this.myData > outro.myData){
            i = 1;
        }
        else if(this.myData < outro.myData){
            i = -1;
        }

        return i;

    }

    @Override
    public String toString(){
        return myData.toString();
    }

}