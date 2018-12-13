package ua.hillel.bodrug.lesson5;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        /*Complex complex = new Complex(2,3);

        Complex complex1 = new Complex(1,2);
        Complex complexAdd = complex.add(complex1);
        out.println("complex = " + complex.a +"+" + complex.b + "*i");
        out.println("complex1 = " + complex1.a + "+" +complex1.b + "*i");
        out.println("complexAdd = " + complexAdd.a + "+" +complexAdd.b + "*i");
        AtomicReference<Complex> complexSub = new AtomicReference<>(complex.subtract(complex1));
        out.println("complexSub = " + complexSub.get().a + "+" + complexSub.get().b + "*i");
        Complex complexDiv = complex.divide(complex1);F
        out.println("complexDiv = " + complexDiv.a + "+" +complexDiv.b + "*i");
        AtomicReference<Complex> complexMult = new AtomicReference<>(complex.mult(complex1));
        out.println("complexMult = " + complexMult.get().a + "+" + complexMult.get().b + "*i");

        System.out.println("Массив****************************");

        for (int i = 0; i < 5; i++) {
            complexes[i] = new Complex(i+1,i+2);
        }*/
        Complex[] complexes = new Complex[5];
        complexes[0] = new Complex(3,2);
        complexes[1] = new Complex(1,6);
        complexes[2] = new Complex(5,2);
        complexes[3] = new Complex(2,8);
        complexes[4] = new Complex(6,6);
        Arrays.sort(complexes);

        Complex[] complexes1 = new Complex[5];
        complexes1[0] = new Complex(1,2);
        complexes1[1] = new Complex(1,1);
        complexes1[2] = new Complex(8,4);
        complexes1[3] = new Complex(10,1);
        complexes1[4] = new Complex(3,1);
        Arrays.sort(complexes1);



        Complex[] complexes2 = new Complex[complexes.length+complexes1.length];
        int index = 0;
        for (int i = 0; i < complexes.length; i++) {
            complexes2[i] = new Complex(complexes[i].a,complexes[i].b);
            index++;
        }

        for (int i = 0; i < complexes1.length; i++) {
            complexes2[index] = new Complex(complexes1[i].a,complexes1[i].b);
            index++;
        }

        Arrays.sort(complexes2);


        for (int i = 0; i < complexes.length; i++) {
            System.out.println(complexes[i].a + " " + complexes[i].b);
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < complexes1.length ; i++) {
            System.out.println(complexes1[i].a + " " + complexes1[i].b);
        }

        System.out.println("---------------------------------------------");

        for (int i = 0; i < complexes2.length; i++) {
            System.out.println(complexes2[i].a + " " + complexes2[i].b);
        }
        }



}
