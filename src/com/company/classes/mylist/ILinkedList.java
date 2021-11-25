package com.company.classes.mylist;

import java.util.Collection;
import java.util.Iterator;

public interface ILinkedList<E> extends java.lang.Iterable<E>, Collection<E> {
    boolean add(E element); //возвращаемый тип был изменён, т.к. для оптимизации кода пришлось отнаследовать Collection
    void add(int index, E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    E set(int index, E element);
    int size();
    Object[] toArray();
    <T> T[] toArray(T[] a);
    String toString();
    Iterator<E> iterator();
}
