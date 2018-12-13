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

        Complex[] c1 = new Complex[5];
        c1[0] = new Complex(3, 2);
        c1[1] = new Complex(1, 6);
        c1[2] = new Complex(5, 2);
        c1[3] = new Complex(2, 8);
        c1[4] = new Complex(6, 6);
        Arrays.sort(c1);

        Complex[] c2 = new Complex[5];
        c2[0] = new Complex(1, 2);
        c2[1] = new Complex(1, 1);
        c2[2] = new Complex(8, 4);
        c2[3] = new Complex(10, 1);
        c2[4] = new Complex(3, 1);
        Arrays.sort(c2);

        Complex[] complexes2 = new Complex[c1.length + c2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < c1.length && j < c2.length) {
            int compare = c1[i].compareTo(c2[j]);
            if (compare < 0) {
                complexes2[k] = c1[i];
                i++;
            } else {
                complexes2[k] = c2[j];
                j++;
            }
            k++;
        }

        while (i < c1.length) {
            complexes2[k] = c1[i];
            i++;
            k++;
        }

        while (j < c2.length) {
            complexes2[k] = c2[j];
            j++;
            k++;
        }
        for (Complex aComplexes2 : complexes2) {
            System.out.println(aComplexes2.a + " " + aComplexes2.b);
        }
    }
}

