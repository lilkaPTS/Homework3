package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        for (Integer integer: linkedList) {
            System.out.println(integer);
        }
    }
}
