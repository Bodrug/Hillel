package ua.hillel.bodrug.lesson20;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyTreeSet myTreeSet = new MyTreeSet();
        myTreeSet.add(25);
        myTreeSet.add(17);
        myTreeSet.add(39);
        myTreeSet.add(15);
        myTreeSet.add(35);
        myTreeSet.add(47);
        myTreeSet.add(20);
        myTreeSet.add(27);
        myTreeSet.add(19);
        myTreeSet.add(40);
        myTreeSet.add(37);

        Iterator it = myTreeSet.iterator();
        /*while (it.hasNext()){
            System.out.println(it.next());
        }*/
        System.out.println(it.next());


    }
}
