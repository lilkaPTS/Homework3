package com.company.main;


import com.company.classes.enums.Test;
import com.company.classes.figures.Circle;
import com.company.classes.mylist.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class TestPerformance {

    public static final int QUANTITY = 1000000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arrays.asList(Test.values()).forEach(ex -> System.out.println((ex.ordinal()+1) + ") " + ex.getDescription()));
        if(in.hasNextInt()){
            switch (Test.values()[in.nextInt()-1]) {
                case TEST1: {
                    LinkedList<Circle> linkedList = new LinkedList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        linkedList.add(new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в LinkedList: " + leadTime);
                    break;
                }
                case TEST2: {
                    MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < QUANTITY; i++) {
                        myLinkedList.add(new Circle());
                    }
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    System.out.println("Время добавления " + QUANTITY + " кругов в LinkedList: " + leadTime);
                    break;
                }
                case TEST3: {
                    LinkedList<Circle> linkedList = new LinkedList<>();
                    MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
                    for (int i = 0; i < QUANTITY; i++) {
                        linkedList.add(new Circle());
                        myLinkedList.add(new Circle());
                    }
                    long start = System.nanoTime();
                    linkedList.get(QUANTITY/2);
                    long finish = System.nanoTime();
                    long leadTime = finish - start;
                    long start1 = System.nanoTime();
                    myLinkedList.get(QUANTITY/2);
                    long finish1 = System.nanoTime();
                    long leadTime1 = finish1 - start1;
                    System.out.println("Поиск элемента в LinkedList: " + leadTime);
                    System.out.println("Поиск элемента в MyLinkedList: " + leadTime1);
                    break;
                }
            }
        }
    }
}