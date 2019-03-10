package ua.hillel.bodrug.lesson20;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyTreeSet myTreeSet = new MyTreeSet();
        myTreeSet.add(99);
        myTreeSet.add(21);
        myTreeSet.add(34);
        myTreeSet.add(1);
        myTreeSet.add(250);
        myTreeSet.add(88);
        myTreeSet.add(65);
        myTreeSet.add(70);
        myTreeSet.add(70);
        myTreeSet.add(22);
        myTreeSet.add(20);
        myTreeSet.add(98);
        myTreeSet.add(41);

        Iterator it = myTreeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //System.out.println(it.next());


    }
}
