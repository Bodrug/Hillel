package ua.hillel.Bodrug.Lesson2.Task6;

public class Task6Class {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            n = n + a[i];
        }
        System.out.println(n);
    }
}
