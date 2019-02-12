package ua.hillel.bodrug.lesson18;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        Integer[] objects = new Integer[3];
        objects[0] = 1;
        objects[1] = 2;
        objects[2] = 3;
        myCollection.setObjects(objects);
        System.out.println(myCollection);
        myCollection.add(4);
        myCollection.add(5);
        myCollection.add(6);
        System.out.println("-----------------");

        System.out.println(myCollection);
        System.out.println("-----------------");

        Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        myCollection.remove(2);
        System.out.println(myCollection);

        System.out.println(myCollection.contains(3));
        System.out.println("***************************");

        MyCollection newCollection = new MyCollection();
        newCollection.add(9);
        newCollection.add(10);
        newCollection.add(2);
        newCollection.add(1);
        newCollection.add(5);
        myCollection.addAll(newCollection);
        System.out.println(myCollection);
        myCollection.retainAll(newCollection);
        System.out.println("retain");
        System.out.println(myCollection);
        System.out.println("remove all:");
        myCollection.removeAll(newCollection);
        System.out.println(myCollection);
        System.out.println("clear:");
        myCollection.clear();
        System.out.println(myCollection);

    }
}
