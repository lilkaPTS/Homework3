package com.company.classes.enums;

public enum Test {
    TEST1("Добавление в LinkedList"),
    TEST2("Добавление в MyLinkedList"),
    TEST3("Добавление в ArrayList"),
    TEST4("Поиск в ArrayList, LinkedList и MyLinkedList"),
    TEST5("Удаление элемента из ArrayList, LinkedList и MyLinkedList"),
    TEST6("Вставка элемента в ArrayList, LinkedList и MyLinkedList");



    private String description;
    Test(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }
}
