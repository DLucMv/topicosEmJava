package com.dlmv.dataStructures.binaryTree.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T other);
    public abstract String toString();

}
