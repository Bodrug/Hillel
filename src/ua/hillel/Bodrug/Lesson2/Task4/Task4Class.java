package ua.hillel.Bodrug.Lesson2.Task4;

public class Task4Class {
    public static void main(String[] args) {
        int n = 15;
        int mod;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i+1;
            mod = i%3;
            if (mod==0){
                System.out.println(i);
            }
        }
    }
}
