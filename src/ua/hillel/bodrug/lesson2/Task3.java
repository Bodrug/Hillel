package ua.hillel.bodrug.lesson2;

public class Task3 {
    public static void main(String[] args) {
        int n = 8;
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = n-i;
        }

        //Вывод
        for (int q = 0; q < a.length ; q++) {
            System.out.println(a[q]);
        }
    }
}
