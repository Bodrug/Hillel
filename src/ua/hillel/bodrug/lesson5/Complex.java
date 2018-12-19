package ua.hillel.bodrug.lesson5;

public class Complex implements Comparable<Complex> {
    final double a;
    final double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public Complex add(Complex c){
        Complex complex = new Complex(a + c.a, b + c.b);
        return complex;
    }

    public Complex subtract(Complex c){
        Complex complex = new Complex(a - c.a, b-c.b);
        return complex;
    }
    public Complex divide (Complex c){
        Complex complex;
        complex = new Complex(((a*c.a + b*c.b)/exp(c.a,c.b)),(b*c.a-a*c.b)/exp(c.a,c.b));
        return  complex;
    }

    public double exp (double x, double y){
        return x*x + y*y;
    }

    public Complex mult(Complex c){
        return new Complex((a*c.a-b*c.b),(a*c.b+b*c.a));
    }

    public static void main(String[] args) {
        Complex complex = new Complex(2,3);
        Complex complex1 = new Complex(1,2);
        Complex complexAdd = complex.add(complex1);
        System.out.println("complex = " + complex.a +"+" + complex.b + "*i");
        System.out.println("complex1 = " + complex1.a + "+" +complex1.b + "*i");
        System.out.println("complexAdd = " + complexAdd.a + "+" +complexAdd.b + "*i");
        Complex complexSub = complex.subtract(complex1);
        System.out.println("complexSub = " + complexSub.a + "+" +complexSub.b + "*i");
        Complex complexDiv = complex.divide(complex1);
        System.out.println("complexDiv = " + complexDiv.a + "+" +complexDiv.b + "*i");
        Complex complexMult = complex.mult(complex1);
        System.out.println("complexMult = " + complexMult.a + "+" +complexMult.b + "*i");
    }


    public Comparable add(Comparable comparable) {
        Complex c = (Complex) comparable;
        return new Complex(a + c.a, b + c.b);
    }


    public Comparable subtract(Comparable comparable) {
        Complex c = (Complex) comparable;
        return new Complex(a - c.a, b-c.b);
    }


    public Comparable divide(Comparable comparable) {
        Complex c = (Complex) comparable;
        Complex complex = new Complex(((a*c.a + b*c.b)/exp(c.a,c.b)),(b*c.a-a*c.b)/exp(c.a,c.b));
        return  complex;
    }


    public Comparable mult(Comparable comparable) {
        Complex c = (Complex) comparable;
        Complex complex = new Complex((a*c.a-b*c.b),(a*c.b+b*c.a));
        return complex;
    }


    @Override
    public int compareTo(Complex o) {
        if ((this.a+this.b) > (o.a+o.b)){
            return 1;
        }
        else {
            return -1;
        }
    }
}
