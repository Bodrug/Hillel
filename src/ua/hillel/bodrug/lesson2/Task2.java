package ua.hillel.bodrug.lesson2;

public class Task2 {
    public static void main(String[] args) {
        int n = 8;
        int [] x = new int[n];
        for (int i = 0; i < n ; i++) {
            x[i] = i+1;
        }
        //Для проверки выведем в консоль
        for (int aX : x) {
            System.out.println(aX);
        }
    }
}
