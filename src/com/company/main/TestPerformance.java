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

                if(index==3 || index==4 || index==5) {
                    for (int i = 0; i < QUANTITY; i++) {
                        linkedList.add(new Circle());
                        myLinkedList.add(new Circle());
                        arrayList.add(new Circle());
                    }
                } //167531300
                  //2977603500
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
                    myLinkedList.get(3);
                    long finish1 = System.nanoTime();
                    leadTime = finish1 - finish;
                    System.out.println("Поиск элемента в MyLinkedList: " + leadTime);
                    arrayList.get(3);
                    long finish2 = System.nanoTime();
                    leadTime = finish2 - finish1;
                    System.out.println("Поиск элемента в ArrayList: " + leadTime);
                    break;
                }
                case TEST5: {
                    long start = System.nanoTime();
                    linkedList.remove(3);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Удаление элемента из LinkedList: " + leadTime);
                    myLinkedList.remove(3);
                    long finish1 = System.nanoTime();
                    leadTime = finish1 - finish;
                    System.out.println("Удаление элемента из MyLinkedList: " + leadTime);
                    arrayList.remove(3);
                    long finish2 = System.nanoTime();
                    leadTime = finish2 - finish1;
                    System.out.println("Удаление элемента из ArrayList: " + leadTime);
                    break;
                }
                case TEST6: {
                    long start = System.nanoTime();
                    linkedList.add(3, new Circle());
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Вставка элемента в LinkedList: " + leadTime);
                    myLinkedList.add(3, new Circle());
                    long finish1 = System.nanoTime();
                    leadTime = finish1 - finish;
                    System.out.println("Вставка элемента в MyLinkedList: " + leadTime);
                    arrayList.add(3, new Circle());
                    long finish2 = System.nanoTime();
                    leadTime = finish2 - finish1;
                    System.out.println("Вставка элемента в ArrayList: " + leadTime);
                    break;
                }

            }
        }
    }
}