package ua.hillel.bodrug.lesson5;

import java.util.concurrent.atomic.AtomicReference;

import static java.lang.System.*;

public class Complex implements Comparable<Complex> {
    private final double a;
    private final double b;

    private Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }


    private Complex add(Complex c){
        return new Complex(a + c.a, b + c.b);
    }

    private Complex subtract(Complex c){
        return new Complex(a - c.a, b-c.b);
    }
    private Complex divide(Complex c){
        Complex c1 = c;
        Complex complex;
        complex = new Complex(((a*c.a + b*c.b)/exp(c.a,c.b)),(b*c.a-a*c.b)/exp(c.a,c.b));
        return  complex;
    }

    private double exp(double x, double y){
        return x*x + y*y;
    }

    private Complex mult(Complex c){
        return new Complex((a*c.a-b*c.b),(a*c.b+b*c.a));
    }

    public static void main(String[] args) {
        Complex complex = new Complex(2,3);
        Complex complex1 = new Complex(1,2);
        Complex complexAdd = complex.add(complex1);
        out.println("complex = " + complex.a +"+" + complex.b + "*i");
        out.println("complex1 = " + complex1.a + "+" +complex1.b + "*i");
        out.println("complexAdd = " + complexAdd.a + "+" +complexAdd.b + "*i");
        AtomicReference<Complex> complexSub = new AtomicReference<>(complex.subtract(complex1));
        out.println("complexSub = " + complexSub.get().a + "+" + complexSub.get().b + "*i");
        Complex complexDiv = complex.divide(complex1);
        out.println("complexDiv = " + complexDiv.a + "+" +complexDiv.b + "*i");
        AtomicReference<Complex> complexMult = new AtomicReference<>(complex.mult(complex1));
        out.println("complexMult = " + complexMult.get().a + "+" + complexMult.get().b + "*i");
    }


    @Override
    public int compareTo(Complex o) {
        return 0;
    }
}
