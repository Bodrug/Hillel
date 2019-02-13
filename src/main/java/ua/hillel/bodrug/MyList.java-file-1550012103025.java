package ua.hillel.bodrug.lesson19;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;


    public MyList() {
        head = null;
        tail = null;
    }

    public boolean add(T e){
        Node<T> tail = tail();
        if (tail==null){
            head = new Node<T>(e);
        }
        else {
            tail.next = new Node<T>(e);
        }
        return true;
    }

    private Node<T> tail(){
        Node<T> node = head;
        while (node!=null && node.next!=null){
            node = node.next;
        }
        return node;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T data = node.data;
                    node = node.next;
                    return data;
                }
                return null;
            }
        };
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
            next = null;
        }
    }
}

