package ua.hillel.bodrug.lesson4;

import java.util.Scanner;

/*
Выводим числа фибоначи
 */
public class Task5 {
    public static void main(String[] args) {
     printFibonachi();
    }
    public static void printFibonachi(){
        Scanner str = new Scanner(System.in);
        System.out.println("Укажите, сколько нужно вывести чисел Фибоначчи");
        int count = str.nextInt();
        int a = 0, b = 1;
        int fib;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <= count-3; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(fib);
        }

    }

}
