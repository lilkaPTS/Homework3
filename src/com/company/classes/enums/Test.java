package com.company.classes.enums;

public enum Test {
    TEST1("Добавление в LinkedList"),
    TEST2("Добавление в MyLinkedList"),
    TEST3("Поиск в LinkedList и MyLinkedList");


    private String description;
    Test(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }
}
