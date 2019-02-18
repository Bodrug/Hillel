package ua.hillel.bodrug.lesson20;

import java.util.Comparator;
import java.util.Iterator;

public class MyTreeSet<T> implements Comparator, Iterable<T> {
    private Node head;

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean add(T e) {
        if (head == null) {
            head = new Node(e);
        } else if (head != null) {
            if (compare(head.value, e) > 0) {
                head.right = new Node(e);
            } else {
                if (compare(head.value, e) < 0) {
                    head.right = new Node(e);
                }
            }

        }

        return true;
    }

    private boolean appendToTree(Node appendTo, T add) {
        Integer existing = (Integer) appendTo.value;
        Integer addInt = (Integer) add;
        if (addInt < existing) {
            if (appendTo.left == null) {
                Node newNode = new Node(add);
                appendTo.left = newNode;
            } else {
                return appendToTree(appendTo.left, add);
            }
            //return true;
        } else {
            if (addInt > existing) {
                if (appendTo.right == null) {
                    Node newNode = new Node(add);
                    appendTo.right = newNode;
                } else {
                    return appendToTree(appendTo.right, add);
                }
                //return true;
            } else {
                appendTo.value = add;
                return false;
            }

        }
        return false;
    }

        @Override
        public Iterator<T> iterator () {
            return null;
        }

        @Override
        public int compare (Object o1, Object o2){
            return 0;
        }
    }
