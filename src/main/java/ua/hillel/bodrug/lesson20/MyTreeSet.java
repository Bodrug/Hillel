package ua.hillel.bodrug.lesson20;

import java.util.Iterator;

public class MyTreeSet<E> implements Iterable {
    private Node head;


    private class Node {
        private E value;
        private Node left;
        private Node right;
        private Node parent;
        private boolean isIterated;

        public Node(E value) {
            this.value = value;
        }
    }

    public boolean add(E e) {
        if (head == null) {
            head = new Node(e);
        } else appendToTree(head, e);
        return true;
    }

    private boolean appendToTree(Node appendTo, E add) {
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
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            //private Node currentNode;
            private boolean theEnd;
            private Node node = getLastNode(head);
            private Node max = getMax(head);

            private Node getMax(Node head) {
                while (head.right != null) {
                    return getMax(head.right);
                }
                return head;
            }

            private boolean doneLeft = false;
            private boolean doneRight = false;

            private Node getLastNode(Node node1) {
                if (node1.left != null) {
                    //System.out.println(n.value);
                    return getLastNode(node1.left);
                } else {
                    return node1;
                }
            }

            @Override
            public boolean hasNext() {

//                boolean theEnd;
//                if (node.parent == head && node.parent.isIterated && node.isIterated) {
//                    theEnd = true;
//                } else {
//                    theEnd = false;
//                }
//                return !theEnd;
                return !theEnd;
            }

            @Override
            public E next() {
                if (node == max) {
                    theEnd = true;
                    return node.value;
                }

                if (node == head && !doneLeft) {
                    doneLeft = true;
                }

                if (node.right != null) {
                    Node val = node;
                    val.isIterated = true;
                    node = getLastNode(node.right);
                    return val.value;
                }
                else {
                    Node val = node;
                    val.isIterated= true;
                    node = getNotIteratedParent(node);
                    return val.value;
                }
            }
            private Node getNotIteratedParent(Node parent) {
                while (true) {
                    if (!parent.parent.isIterated) {
                        return parent.parent;
                    } else return getNotIteratedParent(parent.parent);
                }
            }
        };
    }
}
