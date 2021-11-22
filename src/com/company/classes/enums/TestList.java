package com.company.classes.enums;

public enum TestList {
    TEST1("Добавление в LinkedList"),
    TEST2("Добавление в MyLinkedList"),
    TEST3("Добавление в ArrayList"),
    TEST4("Добавление в HashSet"),
    TEST5("Добавление в LinkedHashSet"),
    TEST6("Добавление в TreeSet"),
    TEST7("Добавление в HashMap"),
    TEST8("Добавление в LinkedHashMap"),
    TEST9("Добавление в TreeMap"),
    TEST10("Поиск в LinkedList"),
    TEST11("Поиск в MyLinkedList"),
    TEST12("Поиск в ArrayList"),
    TEST13("Поиск в HashMap"),
    TEST14("Поиск в LinkedHashMap"),
    TEST15("Поиск в TreeMap"),
    TEST16("Удаление элемента из LinkedList"),
    TEST17("Удаление элемента из MyLinkedList"),
    TEST18("Удаление элемента из ArrayList"),
    TEST19("Удаление элемента из HashSet"),
    TEST20("Удаление элемента из LinkedHashSet"),
    TEST21("Удаление элемента из TreeSet"),
    TEST22("Удаление элемента из HashMap"),
    TEST23("Удаление элемента из LinkedHashMap"),
    TEST24("Удаление элемента из TreeMap"),
    TEST25("Вставка элемента в LinkedList"),
    TEST26("Вставка элемента в MyLinkedList"),
    TEST27("Вставка элемента в ArrayList"),
    TEST28("Изменение элемента в LinkedList"),
    TEST29("Изменение элемента в MyLinkedList"),
    TEST30("Изменение элемента в ArrayList");



    private String description;
    TestList(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }
}
