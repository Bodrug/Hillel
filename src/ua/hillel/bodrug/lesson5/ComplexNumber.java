package ua.hillel.bodrug.lesson5;

public class ComplexNumber implements Comparable {
    final double a;
    final double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber c){
        ComplexNumber complex = new ComplexNumber(a + c.a, b + c.b);
        return complex;
    }

    public ComplexNumber subtract(ComplexNumber c){
        ComplexNumber complex = new ComplexNumber(a - c.a, b-c.b);
        return complex;
    }
    public ComplexNumber divide (ComplexNumber c){
        ComplexNumber complex;
        complex = new ComplexNumber(((a*c.a + b*c.b)/exp(c.a,c.b)),(b*c.a-a*c.b)/exp(c.a,c.b));
        return  complex;
    }

    public double exp (double x, double y){
        return x*x + y*y;
    }

    public ComplexNumber mult(ComplexNumber c){
        return new ComplexNumber((a*c.a-b*c.b),(a*c.b+b*c.a));
    }

    public static void main(String[] args) {
        ComplexNumber complex = new ComplexNumber(2,3);
        ComplexNumber complex1 = new ComplexNumber(1,2);
        ComplexNumber complexAdd = complex.add(complex1);
        System.out.println("complex = " + complex.a +"+" + complex.b + "*i");
        System.out.println("complex1 = " + complex1.a + "+" +complex1.b + "*i");
        System.out.println("complexAdd = " + complexAdd.a + "+" +complexAdd.b + "*i");
        ComplexNumber complexSub = complex.subtract(complex1);
        System.out.println("complexSub = " + complexSub.a + "+" +complexSub.b + "*i");
        ComplexNumber complexDiv = complex.divide(complex1);
        System.out.println("complexDiv = " + complexDiv.a + "+" +complexDiv.b + "*i");
        ComplexNumber complexMult = complex.mult(complex1);
        System.out.println("complexMult = " + complexMult.a + "+" +complexMult.b + "*i");
    }


    public Comparable add(Comparable comparable) {
        ComplexNumber c = (ComplexNumber) comparable;
        return new ComplexNumber(a + c.a, b + c.b);
    }


    public Comparable subtract(Comparable comparable) {
        ComplexNumber c = (ComplexNumber) comparable;
        return new ComplexNumber(a - c.a, b-c.b);
    }


    public Comparable divide(Comparable comparable) {
        ComplexNumber c = (ComplexNumber) comparable;
        ComplexNumber complex = new ComplexNumber(((a*c.a + b*c.b)/exp(c.a,c.b)),(b*c.a-a*c.b)/exp(c.a,c.b));
        return  complex;
    }


    public Comparable mult(Comparable comparable) {
        ComplexNumber c = (ComplexNumber) comparable;
        ComplexNumber complex = new ComplexNumber((a*c.a-b*c.b),(a*c.b+b*c.a));
        return complex;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
