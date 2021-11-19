package com.company.main;

import com.company.classes.figures.Circle;
import com.company.classes.mylist.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class TestMainFunctionality {

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
        System.out.println();
        myLinkedList.clear();
        System.out.println("\nclear() - toString() - " + myLinkedList);

        // LinkedList.toArray(T[] a) vs MyLinkedList.toArray(T[] a) ///////////////////
        System.out.println("Integer:");
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i);
            l.add(i);
        }

        Integer[] arr1 = new Integer[11];
        System.out.println("LinkedList:");
        Arrays.asList(l.toArray(arr1)).forEach(System.out::print);
        System.out.println();
        Arrays.asList(l.toArray(new Integer[0])).forEach(System.out::print);

        System.out.println("\n");

        Integer[] arr2 = new Integer[11];
        System.out.println("MyLinkedList:");
        Arrays.asList(myLinkedList.toArray(arr2)).forEach(System.out::print);
        System.out.println();
        Arrays.asList(myLinkedList.toArray(new Integer[0])).forEach(System.out::print);
        l.clear();
        myLinkedList.clear();
        System.out.println("\n");
        //////////////////////////////////////////////////////////////////


        // LinkedList.toArray(T[] a) vs MyLinkedList.toArray(T[] a) //
        System.out.println("Circle:");
        MyLinkedList<Circle> mll = new MyLinkedList<>();
        LinkedList<Circle> ll =  new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            mll.add(new Circle());
            ll.add(new Circle());
        }
        System.out.println("MyLinkedList:");
        Arrays.asList(mll.toArray(new Circle[5])).forEach(System.out::print);
        System.out.println("\n\nLinkedList:");
        Arrays.asList(ll.toArray(new Circle[5])).forEach(System.out::print);
        mll.clear();
        ll.clear();
        /////////////////////////////////////////////////////////////////
    }
}
