package ua.hillel.Bodrug.Lesson2.Task9;

public class Task9Class {
    public static void main(String[] args) {
        int n = 10;
        int s = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i+1;
            if (a[i]%2!=0){
                s = s*a[i];
            }
        }
        System.out.println(s);
    }
}
