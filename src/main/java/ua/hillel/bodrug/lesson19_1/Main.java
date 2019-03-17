package ua.hillel.bodrug.lesson19_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
        public static void main(String[] args) {
            MyList list = new MyList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            Iterator it = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

            System.out.println("-------------------------------");
            list.clear();
            Iterator it1 = list.iterator();
            while (it1.hasNext()){
                System.out.println(it1.next());
            }
            System.out.println(list.size());

            list.add(22);
            Iterator it2 = list.iterator();
            while (it2.hasNext()){
                System.out.println(it2.next());
            }
        }
    }


