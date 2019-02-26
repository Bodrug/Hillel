package ua.hillel.bodrug.lesson20;

import java.util.Comparator;
import java.util.Iterator;

public class MyTreeSet<T> implements Iterable {
    private Node head;


    private class Node {
        private T value;
        private Node left;
        private Node right;
        private Node parent;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    public boolean add(T e) {
        if (head == null) {
            head = new Node(e);
        } else appendToTree(head, e);
        return true;
    }

    private boolean appendToTree(Node appendTo, T add) {
        Integer existing = (Integer) appendTo.value;
        Integer addInt = (Integer) add;
        if (addInt < existing) {
            if (appendTo.left == null) {
                Node newNode = new Node(add);
                newNode.parent = appendTo;
                appendTo.left = newNode;
            } else {
                return appendToTree(appendTo.left, add);
            }
            //return true;
        } else {
            if (addInt > existing) {
                if (appendTo.right == null) {
                    Node newNode = new Node(add);
                    newNode.parent = appendTo;
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
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node node = head;

            @Override
            public boolean hasNext() {
                return node.left != null | node.right != null;
                //return node.parent != null;
            }

            @Override
            public T next() {

                if (node == null)
                    return null;
                else if (node.right != null) {
                    Node p = node.right;
                    while (p.left != null)
                        p = p.left;
                    node = p;
                    return p.value;

                } else {
                    Node p = node.parent;
                    Node ch = node;
                    while (p != null && ch == p.right) {
                        ch = p;
                        p = p.parent;
                        node = p;
                    }
                    return p.value;
                }

            }
        };
    }

}
