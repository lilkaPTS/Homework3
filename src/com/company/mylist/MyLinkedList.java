package com.company.mylist;

import java.util.Iterator;
import java.util.function.Consumer;

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
        if(size == index) {
            add(element);
        } else {
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
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        if(!(index >= 0 && index < size)) throw new IndexOutOfBoundsException(IOOBMessage(index));
        return node(index).item;
    }



    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}