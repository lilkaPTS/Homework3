package com.company;

import com.company.mylist.MyLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i);
        }
        myLinkedList.add(10, 10);
        System.out.println("get(0) - " + myLinkedList.get(0) +
                "\nget(5) - " + myLinkedList.get(5) +
                "\nget(10) - " + myLinkedList.get(10));
        System.out.println("indexOf(100) - " + myLinkedList.indexOf(100) +
                "\nindexOf(3) - " + myLinkedList.indexOf(3));
        System.out.println("set(10, 123) oldValue - " + myLinkedList.set(10,123));
        System.out.println("size() - " + myLinkedList.size());
        System.out.println("remove(10) remove value - " + myLinkedList.remove(10));
        Object[] arr = myLinkedList.toArray();
        System.out.println("Print arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPrint by forEach: ");
        myLinkedList.forEach(e -> System.out.print(e + " "));
        myLinkedList.clear();
        System.out.println("\nclear() - toString() - " + myLinkedList);

        /*
        long lStartTime = System.nanoTime();
        ////////////

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 100; i++) {
            myLinkedList.add(i);
        }
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            System.out.println(myLinkedList.get(i));
//        }

        ///////////
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
        */

    }
}
