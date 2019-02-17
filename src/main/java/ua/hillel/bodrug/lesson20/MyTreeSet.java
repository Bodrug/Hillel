package ua.hillel.bodrug.lesson20;

import java.util.Comparator;
import java.util.Iterator;

public class MyTreeSet<T> implements Comparator, Iterable<T> {
    private Node node;

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
        if (node == null) {
            node = new Node(e);
        } else if (node != null) {
            if (compare(node.value, e) > 0) {
                node.right = new Node(e);
            } else {
                if (compare(node.value, e) < 0) {
                    node.right = new Node(e);
                }
            }

        }

        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
