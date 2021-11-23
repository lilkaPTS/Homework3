package com.company.main;


import com.company.classes.customaccess.CollectionAccess;
import com.company.classes.customaccess.MapAccess;
import com.company.classes.enums.TestList;
import com.company.classes.figures.Circle;
import com.company.classes.mylist.MyLinkedList;

import java.util.*;

public class TestPerformance {

    public static final int QUANTITY = 10000000;

    public static void main(String[] args) {
        Circle[] arrObj = new Circle[QUANTITY];
        for (int i = 0; i < QUANTITY; i++)
            arrObj[i] = new Circle(i);
        LinkedList<Circle> linkedList = new LinkedList<>();
        MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        ArrayList<Circle> arrayList = new ArrayList<>();
        HashSet<Circle> hashSet = new HashSet<>();
        LinkedHashSet<Circle> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Circle> treeSet = new TreeSet<>();
        Integer[] arrKey = new Integer[QUANTITY];
        for (int i = 0; i < arrKey.length; i++)
            arrKey[i] = i;
        HashMap<Integer, Circle> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Circle> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Circle> treeMap = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        Arrays.asList(TestList.values()).forEach(ex -> System.out.println((ex.ordinal()+1) + ") " + ex.getDescription()));
        if(in.hasNextInt()) {
            int index = in.nextInt();
            if(index == 10 || index == 16 || index == 25 || index == 28) {
                CollectionAccess.fillingCollection(linkedList, arrObj, QUANTITY, false);
            }
            if(index == 11 || index == 17 || index == 26 || index == 29) {
                CollectionAccess.fillingCollection(myLinkedList, arrObj, QUANTITY, false);
            }
            if(index == 12 || index == 18 || index == 27 || index == 30) {
                CollectionAccess.fillingCollection(arrayList, arrObj, QUANTITY, false);
            }
            if(index == 13 || index == 22 || index == 29) {
                MapAccess.fillingMap(hashMap,arrKey, arrObj,QUANTITY, false);
            }
            if(index == 14 || index == 23) {
                MapAccess.fillingMap(linkedHashMap,arrKey, arrObj,QUANTITY, false);
            }
            if(index == 15 || index == 24) {
                MapAccess.fillingMap(treeMap,arrKey, arrObj,QUANTITY, false);
            }
            switch (TestList.values()[index-1]) {
                case TEST1: {
                    CollectionAccess.fillingCollection(linkedList, arrObj, QUANTITY, true);
                    break;
                }
                case TEST2: {
                    CollectionAccess.fillingCollection(myLinkedList, arrObj, QUANTITY, true);
                    break;
                }
                case TEST3: {
                    CollectionAccess.fillingCollection(arrayList, arrObj, QUANTITY, true);
                    break;
                }
                case TEST4: {
                    CollectionAccess.fillingCollection(hashSet, arrObj, QUANTITY, true);
                    break;
                }
                case TEST5: {
                    CollectionAccess.fillingCollection(linkedHashSet, arrObj, QUANTITY, true);
                    break;
                }
                case TEST6: {
                    CollectionAccess.fillingCollection(treeSet, arrObj, QUANTITY, true);
                    break;
                }
                case TEST7: {
                    MapAccess.fillingMap(hashMap,arrKey, arrObj,QUANTITY, true);
                    break;
                }
                case TEST8: {
                    MapAccess.fillingMap(linkedHashMap,arrKey, arrObj,QUANTITY, true);
                    break;
                }
                case TEST9: {
                    MapAccess.fillingMap(treeMap,arrKey, arrObj,QUANTITY, true);
                    break;
                }
                case TEST10: {
                    CollectionAccess.testGet(linkedList,QUANTITY/2);
                    break;
                }
                case TEST11: {
                    CollectionAccess.testGet(myLinkedList,QUANTITY/2);
                    break;
                }
                case TEST12: {
                    CollectionAccess.testGet(arrayList,QUANTITY/2);
                    break;
                }
                case TEST13: {
                    MapAccess.testGet(hashMap,QUANTITY/2);
                    break;
                }
                case TEST14: {
                    MapAccess.testGet(linkedHashMap,QUANTITY/2);
                    break;
                }
                case TEST15: {
                    MapAccess.testGet(treeMap,QUANTITY/2);
                    break;
                }
                case TEST16: {
                    CollectionAccess.testRemove(linkedList, QUANTITY/2);
                    break;
                }
                case TEST17: {
                    CollectionAccess.testRemove(myLinkedList, QUANTITY/2);
                    break;
                }
                case TEST18: {
                    CollectionAccess.testRemove(arrayList, QUANTITY/2);
                    break;
                }
                case TEST19: {
                    CollectionAccess.fillingCollection(hashSet,arrObj,QUANTITY,false);
                    CollectionAccess.testRemove(hashSet, QUANTITY/2);
                    break;
                }
                case TEST20: {
                    CollectionAccess.fillingCollection(linkedHashSet,arrObj,QUANTITY,false);
                    CollectionAccess.testRemove(linkedHashSet, QUANTITY/2);
                    break;
                }
                case TEST21: {
                    CollectionAccess.fillingCollection(treeSet,arrObj,QUANTITY,false);
                    CollectionAccess.testRemove(treeSet, QUANTITY/2);
                    break;
                }
                case TEST22: {
                    MapAccess.testRemove(hashMap, QUANTITY/2);
                    break;
                }
                case TEST23: {
                    MapAccess.testRemove(linkedHashMap, QUANTITY/2);
                    break;
                }
                case TEST24: {
                    MapAccess.testRemove(treeMap, QUANTITY/2);
                    break;
                }
                case TEST25: {
                    CollectionAccess.testInsert(linkedList, QUANTITY/2, new Circle(54));
                    break;
                }
                case TEST26: {
                    CollectionAccess.testInsert(myLinkedList, QUANTITY/2, new Circle(54));
                    break;
                }
                case TEST27: {
                    CollectionAccess.testInsert(arrayList, QUANTITY/2, new Circle(54));
                    break;
                }
                case TEST28: {
                    CollectionAccess.testSet(linkedList, QUANTITY/2, new Circle(54));
                    break;
                }
                case TEST29: {
                    CollectionAccess.testSet(myLinkedList, QUANTITY/2, new Circle(54));
                    break;
                }
                case TEST30: {
                    CollectionAccess.testSet(arrayList, QUANTITY/2, new Circle(54));
                    break;
                }
            }
        }
        in.close();
    }
}