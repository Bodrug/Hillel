package ua.hillel.bodrug.lesson20;

import java.util.Iterator;

public class MyTreeSet<E> implements Iterable {
    private Node head;


    private class Node {
        private E value;
        private Node left;
        private Node right;
        private Node parent;

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
            private Node currentNode;
            private Node node = getLastNode(head);

            private Node getLastNode(Node node1) {
                if (node1.left != null) {
                    Node n = getLastNode(node1.left);
                    System.out.println(n.value);
                    return n;
                } else {
                    return node1;
                }
            }

            @Override
            public boolean hasNext() {
                return node.parent != null;
            }

            @Override
            public E next() {
                if (node.right != null&&node!=currentNode) {
                    currentNode = node;
                    this.node = node.right;
                    while (node.left != null) {
                        this.node = node.left;
                    }
                    return node.value;
                } else {
                    if(currentNode==null) {
                        E value = node.value;
                        this.node = node.parent;
                        return value;
                    }
                    else {
                        this.node = node.parent;
                        return node.value;
                    }
                }
//                if (node == null)
//                    return null;
//                else if (node.left != null) {
//                    Node p = node.left;
//                    while (p.left != null)
//                        p = p.left;
//                    node = p;
//                    return p.value;
//
//                } else {
//                    Node p = node.parent;
//                    Node ch = node;
//                    while (p != null && ch == p.right) {
//                        ch = p;
//                        p = p.parent;
//                        node = p;
//                    }
//                    return p.value;
//                }


            }
        }

                ;
    }


}
