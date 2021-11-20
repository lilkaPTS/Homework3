package com.company.classes.enums;

public enum Test {
    TEST1("Добавление в LinkedList"),
    TEST2("Добавление в MyLinkedList"),
    TEST3("Добавление в ArrayList"),
    TEST4("Поиск в LinkedList"),
    TEST5("Поиск в MyLinkedList"),
    TEST6("Поиск в ArrayList"),
    TEST7("Удаление элемента из LinkedList"),
    TEST8("Удаление элемента из MyLinkedList"),
    TEST9("Удаление элемента из ArrayList"),
    TEST10("Вставка элемента в LinkedList"),
    TEST11("Вставка элемента в MyLinkedList"),
    TEST12("Вставка элемента в ArrayList");



    private String description;
    Test(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }
}
