package ua.hillel.bodrug.lesson18;

import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        Integer[] objects = new Integer[3];
        objects[0] = 1;
        objects[1] = 2;
        objects[2] = 3;
        myCollection.setObjects(objects);
        myCollection.add(4);
        myCollection.add(5);
        myCollection.add(6);
        //myCollection.print();
        //System.out.println("-----------------");
        //myCollection.remove(7);
        //myCollection.print();

        Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }

    }
}
