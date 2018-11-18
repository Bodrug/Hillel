package ua.hillel.Bodrug.Lesson2.Task10;

public class Task10Class {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 4;
        try {
            System.out.println(a[n]);
        }
        catch (ArrayIndexOutOfBoundsException x){
            System.out.println("Нет элемента с таким индексом!");
        }
    }
}
