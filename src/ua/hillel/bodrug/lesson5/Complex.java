package ua.hillel.bodrug.lesson5;

import java.util.concurrent.atomic.AtomicReference;

import static java.lang.System.*;

public class Complex implements Comparable<Complex> {
    public final double a;
    public final double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public Complex add(Complex c){
        return new Complex(a + c.a, b + c.b);
    }

    public Complex subtract(Complex c){
        return new Complex(a - c.a, b-c.b);
    }
    public Complex divide(Complex c){
        Complex c1 = c;
        Complex complex;
        complex = new Complex(((a*c.a + b*c.b)/exp(c.a,c.b)),(b*c.a-a*c.b)/exp(c.a,c.b));
        return  complex;
    }

    public double exp(double x, double y){
        return x*x + y*y;
    }

    public Complex mult(Complex c){
        return new Complex((a*c.a-b*c.b),(a*c.b+b*c.a));
    }



    @Override
    public int compareTo(Complex o) {
        if (this.a + this.b > o.a + o.b) {
            return 1;
        }
        return -1;
    }
}
