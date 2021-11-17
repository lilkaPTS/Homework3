package com.company;

import com.company.mylist.MyLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(String.valueOf(i));
        }
        System.out.println("size do:"+myLinkedList.size());
        System.out.println("remove element: "+myLinkedList.remove(0));
        System.out.println("size posle:"+myLinkedList.size()  + "\n");
        Object[] arr = myLinkedList.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("indexOf 4:" + myLinkedList.indexOf("9"));


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
