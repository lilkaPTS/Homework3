package com.company.classes.mylist;

import java.util.*;

public class MyLinkedList<E> implements ILinkedList<E> {

    int size = 0;
    Node<E> first;
    Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    Node<E> node(int index) {
        if(size - index > index) {
            Node<E> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node<E> current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    public MyLinkedList(){}

    @Override
    public void add(E element) {
        Node<E> lastElement = last;
        Node<E> newNode = new Node<>(lastElement, element, null);
        if(last == null) {
            first = newNode;
        } else {
            lastElement.next = newNode;
        }
        last = newNode;
        size++;
    }

    private String IOOBMessage(int index) {
        return String.format("index: %d, size: %d", index, size);
    }

    @Override
    public void add(int index, E element) {
        if(!(index >= 0 && index<=size)) throw new IndexOutOfBoundsException(IOOBMessage(index));
        Node<E> indexNode = node(index);
        Node<E> newNode = new Node<>(indexNode.prev, element, indexNode);
        if(indexNode.prev != null) {
            indexNode.prev.next = newNode;
        } else {
            first = newNode;
        }
        indexNode.prev = newNode;
        size++;
    }

    @Override
    public void clear() {
        Node<E> element = first;
        while (element.next != null) {
            Node<E> elementNext = element.next;
            element.prev = null;
            element.item = null;
            element.next = null;
            element = elementNext;
        }
        first = last = null; // нужна для приведения к null первого и последнего элемента, тк сделав у этих элементов поля равные null, это не значит, что сам элемент стал null
        size=0;
    }

    @Override
    public E get(int index) {
        if(!(index >= 0 && index < size)) throw new IndexOutOfBoundsException(IOOBMessage(index));
        return node(index).item;
    }



    @Override
    public int indexOf(E element) {
        int index = 0;
        if(element == null) {
            for (int i = 0; i < size; i++) {
                if(get(i)==null){
                    return index;
                }
                index++;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if(element.equals(get(i))){
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if(!(index >= 0 && index < size)) throw new IndexOutOfBoundsException(IOOBMessage(index));
        Node<E> indexNode = node(index);
        E returnElement = indexNode.item;
        if(index == 0){
            first = indexNode.next;
            indexNode.next = null;
        } else if(index == size-1) {
            last = indexNode.prev;
            indexNode.prev = null;
        } else {
            indexNode.prev.next = indexNode.next;
            indexNode.next.prev = indexNode.prev;
            indexNode.prev = null;
            indexNode.next = null;
        }
        indexNode.item = null;
        size--;
        return returnElement;
    }

    @Override
    public E set(int index, E element) {
        if(!(index >= 0 && index < size)) throw new IndexOutOfBoundsException(IOOBMessage(index));
        Node<E> indexNode = node(index);
        E oldVal = indexNode.item;
        indexNode.item = element;
        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Object[] toArray() {
        //E[] arr = (E[]) new Object[size]; // Type parameter 'E' cannot be instantiated directly
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = get(i);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) a = (T[])java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        for (int i = 0; i < size; i++) {
            a[i] = (T) get(i);
        }
        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        private int indexReturnElement = 0;

        Itr(){}

        @Override
        public boolean hasNext() {
            return indexReturnElement < size;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E returnValue = get(indexReturnElement);
            indexReturnElement++;
            return returnValue;
        }
    }
}