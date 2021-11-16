package com.company;

import com.company.mylist.MyLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        long lStartTime = System.nanoTime();
        ////////////

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            myLinkedList.add(i);
        }
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            System.out.println(myLinkedList.get(i));
//        }

        ///////////
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);

    }
}
