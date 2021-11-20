package com.company.main;


import com.company.classes.enums.Test;
import com.company.classes.figures.Circle;
import com.company.classes.mylist.MyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class TestPerformance {

    public static final int QUANTITY = 10000000;

    public static void main(String[] args) {
        LinkedList<Circle> linkedList = new LinkedList<>();
        MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        ArrayList<Circle> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Arrays.asList(Test.values()).forEach(ex -> System.out.println((ex.ordinal()+1) + ") " + ex.getDescription()));
        if(in.hasNextInt()) {
                int index = in.nextInt()-1;

                if(index==3 || index==6 || index==9) {
                    for (int i = 0; i < QUANTITY; i++) {
                        linkedList.add(new Circle());
                    }
                }
                if(index==4 || index==7 || index==10) {
                    for (int i = 0; i < QUANTITY; i++) {
                        myLinkedList.add(new Circle());
                    }
                }
                if(index==5 || index==8 || index==11) {
                    for (int i = 0; i < QUANTITY; i++) {
                        arrayList.add(new Circle());
                    }
                }
            switch (Test.values()[index]) {
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
                    System.out.println("Время добавления " + QUANTITY + " кругов в LinkedList: " + leadTime);
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
                    long start = System.nanoTime();
                    linkedList.get(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в LinkedList: " + leadTime);
                    break;
                }
                case TEST5: {
                    long start = System.nanoTime();
                    myLinkedList.get(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в MyLinkedList: " + leadTime);
                    break;
                }
                case TEST6: {
                    long start = System.nanoTime();
                    arrayList.get(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Поиск элемента в ArrayList: " + leadTime);
                    break;
                }
                case TEST7: {
                    long start = System.nanoTime();
                    linkedList.remove(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из LinkedList: " + leadTime);
                    break;
                }
                case TEST8: {
                    long start = System.nanoTime();
                    myLinkedList.remove(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из MyLinkedList: " + leadTime);
                    break;
                }
                case TEST9: {
                    long start = System.nanoTime();
                    arrayList.remove(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из ArrayList: " + leadTime);
                    break;
                }
                case TEST10: {
                    long start = System.nanoTime();
                    linkedList.add(3, new Circle());
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Вставка элемента в LinkedList: " + leadTime);
                    break;
                }
                case TEST11: {
                    long start = System.nanoTime();
                    myLinkedList.add(3, new Circle());
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Вставка элемента в MyLinkedList: " + leadTime);
                    break;
                }
                case TEST12: {
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