package ua.hillel.Bodrug.Lesson2.Task8;

public class Task8Class {
    public static void main(String[] args) {
        int[] a = {0, -1, 4, 22, -10};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max<a[i]){
                max = a[i];
            }
            if (min>a[i]){
                min = a[i];
            }
        }
        int s = max+min;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("SummMaxMin = " + s);

    }
}
