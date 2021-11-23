package com.company.classes.customaccess;

import com.company.classes.mylist.ILinkedList;

import java.util.*;

public abstract class CollectionAccess {

    public static <T> void fillingCollection(Collection<T> collection, T[] element, int quantity, boolean message) {
        int[] randIndexs = new int[quantity];
        for (int i = 0; i < randIndexs.length; i++)
            randIndexs[i] = (int) (Math.random() * element.length);
        long start = System.nanoTime();
        for (int i = 0; i < quantity; i++) {
            collection.add(element[randIndexs[i]]);
        }
        long finish = System.nanoTime();
        long leadTime = finish - start;
        if(message) {
            System.out.println("Время заполнение коллекции " + collection.getClass().getSimpleName() + " " + quantity + " элементами: " + leadTime);
        }
    }

    public static <T> void testGet(Collection<T> collection, int index) {
        long start = 0;
        if(collection instanceof List){
            start = System.nanoTime();
            ((List<T>) collection).get(index);
        }
        if(collection instanceof ILinkedList) {
            start = System.nanoTime();
            ((ILinkedList<T>) collection).get(index);
        }
        long finish = System.nanoTime();
        long leadTime = finish - start;
        System.out.println("Время выполнение метода " + collection.getClass().getSimpleName() + ".get() " + leadTime);

    }

    public static <T> void testRemove(Collection<T> collection, int index) {
        long start = 0;
        if(collection instanceof List){
            start = System.nanoTime();
            ((List<T>) collection).remove(index);
        }
        if(collection instanceof ILinkedList){
            start = System.nanoTime();
            ((ILinkedList<T>) collection).remove(index);
        }
        if(collection instanceof Set){
            int counter = 0;
            Object searchObj = new Object();
            for (Object o: collection) {
                if(counter == collection.size()/2){
                    searchObj = o;
                }
                counter++;
            }
            start = System.nanoTime();
            collection.remove(searchObj);
        }
        long finish = System.nanoTime();
        long leadTime = finish - start;
        System.out.println("Время выполнение метода " + collection.getClass().getSimpleName() + ".remove() " + leadTime);
    }

    public static <T> void testInsert(Collection<T> collection, int index, T obj) {
        long start = 0;
        if(collection instanceof List){
            start = System.nanoTime();
            ((List<T>) collection).add(index, obj);
        }
        if(collection instanceof ILinkedList) {
            start = System.nanoTime();
            ((ILinkedList<T>) collection).add(index, obj);
        }
        long finish = System.nanoTime();
        long leadTime = finish - start;
        System.out.println("Время выполнение метода " + collection.getClass().getSimpleName() + ".add(index, T obj) " + leadTime);
    }

    public static <T> void testSet(Collection<T> collection, int index, T obj) {
        long start = 0;
        if(collection instanceof List){
            start = System.nanoTime();
            ((List<T>) collection).set(index, obj);
        }
        if(collection instanceof ILinkedList) {
            start = System.nanoTime();
            ((ILinkedList<T>) collection).set(index,obj);
        }
        long finish = System.nanoTime();
        long leadTime = finish - start;
        System.out.println("Время выполнение метода " + collection.getClass().getSimpleName() + ".set(index, T obj) " + leadTime);
    }

}
