package com.company.main;


import com.company.classes.enums.Test;
import com.company.classes.figures.Circle;
import com.company.classes.mylist.MyLinkedList;

import java.util.*;

public class TestPerformance {

    public static final int QUANTITY = 10000000;

    public static void main(String[] args) {
        LinkedList<Circle> linkedList = new LinkedList<>();
        MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        ArrayList<Circle> arrayList = new ArrayList<>();
        //Добавление и удаление
        HashSet<Circle> hashSet = new HashSet<>();
        LinkedHashSet<Circle> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Circle> treeSet = new TreeSet<>();
        //Добавление, поиск по ключу, удаление
        HashMap<Integer, Circle> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Circle> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Circle> treeMap = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        Arrays.asList(Test.values()).forEach(ex -> System.out.println((ex.ordinal()+1) + ") " + ex.getDescription()));
        if(in.hasNextInt()) {
            int index = in.nextInt();
            if(index == 10 || index == 16 || index == 25) {
                for (int i = 0; i < QUANTITY; i++) {
                    linkedList.add(new Circle());
                }
            }
            if(index == 11 || index == 17 || index == 26) {
                for (int i = 0; i < QUANTITY; i++) {
                    myLinkedList.add(new Circle());
                }
            }
            if(index == 12 || index == 18 || index == 27) {
                for (int i = 0; i < QUANTITY; i++) {
                    arrayList.add(new Circle());
                }
            }
            if(index == 13 || index == 22) {
                for (int i = 0; i < QUANTITY; i++) {
                    hashMap.put(i,new Circle());
                }
            }
            if(index == 14 || index == 23) {
                for (int i = 0; i < QUANTITY; i++) {
                    linkedHashMap.put(i,new Circle());
                }
            }
            if(index == 15 || index == 24) {
                for (int i = 0; i < QUANTITY; i++) {
                    treeMap.put(i,new Circle(i));
                }
            }
            switch (Test.values()[index-1]) {
                case TEST1: {
                    LinkedList<Circle> ll = new LinkedList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        ll.add(new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в LinkedList: " + leadTime);
                    break;
                }
                case TEST2: {
                    MyLinkedList<Circle> mll = new MyLinkedList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        mll.add(new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в MyLinkedList: " + leadTime);
                    break;
                }
                case TEST3: {
                    ArrayList<Circle> al = new ArrayList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        al.add(new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в ArrayList: " + leadTime);
                    break;
                }
                case TEST4: {
                    HashSet<Circle> hs = new HashSet<Circle>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        hs.add(new Circle(i));
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в HashSet: " + leadTime);
                    break;
                }
                case TEST5: {
                    LinkedHashSet<Circle> lhs = new LinkedHashSet<Circle>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        lhs.add(new Circle(i));
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в LinkedHashSet: " + leadTime);
                    break;
                }
                case TEST6: {
                    TreeSet<Circle> ts = new TreeSet<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        ts.add(new Circle(i));
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в TreeSet: " + leadTime);
                    break;
                }
                case TEST7: {
                    HashMap<Integer,Circle> hm = new HashMap<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        hm.put(i,new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в HashMap: " + leadTime);
                    break;
                }
                case TEST8: {
                    LinkedHashMap<Integer,Circle> lhm = new LinkedHashMap<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        lhm.put(i,new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в LinkedHashMap: " + leadTime);
                    break;
                }
                case TEST9: {
                    TreeMap<Integer,Circle> tm = new TreeMap<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        tm.put(i,new Circle(i));
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в TreeMap: " + leadTime);
                    break;
                }
                case TEST10: {
                    long start = System.nanoTime();
                    linkedList.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в LinkedList: " + leadTime);
                    break;
                }
                case TEST11: {
                    long start = System.nanoTime();
                    myLinkedList.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в MyLinkedList: " + leadTime);
                    break;
                }
                case TEST12: {
                    long start = System.nanoTime();
                    arrayList.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в ArrayList: " + leadTime);
                    break;
                }
                case TEST13: {
                    long start = System.nanoTime();
                    hashMap.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в HashMap: " + leadTime);
                    break;
                }
                case TEST14: {
                    long start = System.nanoTime();
                    linkedHashMap.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в LinkedHashMap: " + leadTime);
                    break;
                }
                case TEST15: {
                    long start = System.nanoTime();
                    treeMap.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в TreeMap: " + leadTime);
                    break;
                }
                case TEST16: {
                    long start = System.nanoTime();
                    linkedList.remove(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из LinkedList: " + leadTime);
                    break;
                }
                case TEST17: {
                    long start = System.nanoTime();
                    myLinkedList.remove(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из MyLinkedList: " + leadTime);
                    break;
                }
                case TEST18: {
                    long start = System.nanoTime();
                    arrayList.remove(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из ArrayList: " + leadTime);
                    break;
                }
                case TEST19: {
                    for (int i = 0; i < QUANTITY; i++) {
                        hashSet.add(new Circle(i));
                    }
                    long start = System.nanoTime();
                    hashSet.remove(new Circle(QUANTITY/2));
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из HashSet: " + leadTime);
                    break;
                }
                case TEST20: {
                    for (int i = 0; i < QUANTITY; i++) {
                        linkedHashSet.add(new Circle(i));
                    }
                    long start = System.nanoTime();
                    linkedHashSet.remove(new Circle(QUANTITY/2));
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из LinkedHashSet: " + leadTime);
                    break;
                }
                case TEST21: {
                    for (int i = 0; i < QUANTITY; i++) {
                        treeSet.add(new Circle(i));
                    }
                    long start = System.nanoTime();
                    treeSet.remove(new Circle(QUANTITY/2));
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из TreeSet: " + leadTime);
                    break;
                }
                case TEST22: {
                    long start = System.nanoTime();
                    hashMap.remove(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из HashMap: " + leadTime);
                    break;
                }
                case TEST23: {
                    long start = System.nanoTime();
                    linkedHashMap.remove(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из LinkedHashMap: " + leadTime);
                    break;
                }
                case TEST24: {
                    long start = System.nanoTime();
                    treeMap.remove(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из TreeMap: " + leadTime);
                    break;
                }
                case TEST25: {
                    long start = System.nanoTime();
                    linkedList.add(3, new Circle());
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Вставка элемента в LinkedList: " + leadTime);
                    break;
                }
                case TEST26: {
                    long start = System.nanoTime();
                    myLinkedList.add(3, new Circle());
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Вставка элемента в MyLinkedList: " + leadTime);
                    break;
                }
                case TEST27: {
                    long start = System.nanoTime();
                    arrayList.add(3, new Circle());
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Вставка элемента в ArrayList: " + leadTime);
                    break;
                }

            }
        }
    }
}