package ua.hillel.Bodrug.Lesson2.Task7;

public class Task7Class {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        double n = 0;
        double x = 0;
        if(a.length==0){
            System.out.println("Длина массива = 0!");
        }
        else {
            for (int i = 0; i < a.length; i++) {
                n = n + a[i];
            }
            x = n / a.length;
            System.out.println("Summ = " + n);
            System.out.println("Quantity = " + a.length);
            System.out.println("Mean = " + x);
        }
    }
}
