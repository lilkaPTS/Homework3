package com.company.classes.customaccess;

import java.util.List;
import java.util.Map;

public abstract class MapAccess {
    public static <K,V> void fillingMap(Map<K,V> collection, K[] key, V[] value, int quantity, boolean message) {
        int[] randIndexs = new int[quantity];
        for (int i = 0; i < randIndexs.length; i++) {
            randIndexs[i] = (int) (Math.random() * key.length);
        }
        long start = System.nanoTime();
        for (int i = 0; i < quantity; i++) {
            collection.put(key[randIndexs[i]],value[randIndexs[i]]);
        }
        long finish = System.nanoTime();
        long leadTime = finish - start;
        if(message) {
            System.out.println("Время заполнение коллекции " + collection.getClass().getSimpleName() + " " + quantity + " элементами: " + leadTime);
        }
    }

    public static <K,V> void testGet(Map<K,V> collection, int index) {
        long start = System.nanoTime();
        collection.get(index);
        long finish = System.nanoTime();
        long leadTime = finish - start;
        System.out.println("Время выполнение метода " + collection.getClass().getSimpleName() + ".get() " + leadTime);
    }

    public static <K,V> void testRemove(Map<K,V> collection, int index) {
        long start = System.nanoTime();
        collection.remove(index);
        long finish = System.nanoTime();
        long leadTime = finish - start;
        System.out.println("Время выполнение метода " + collection.getClass().getSimpleName() + ".remove() " + leadTime);
    }
}
