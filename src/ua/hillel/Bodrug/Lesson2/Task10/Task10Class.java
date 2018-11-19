package ua.hillel.Bodrug.Lesson2.Task10;

public class Task10Class {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 5, 4, 7, 8, 4};
        int n = 4;
        boolean f = false;
        for (int i = 0; i < a.length ; i++) {
            if (n==a[i]){
                System.out.println(n + " находится в массиве под индексом " + i);
                f = true;
            }
        }
        if (f==false){
            System.out.println("В массиве отсутствуют элементы со значением " + n);
        }
    }
}
