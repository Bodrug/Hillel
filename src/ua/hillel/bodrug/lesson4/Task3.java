package ua.hillel.bodrug.lesson4;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        /*
        Задача: вывести все простые числа.
        Вариант решения: берем циклом числа от 2 до a.
        И каждое делим на все предыдушие. Если на какое-то делится без остатка, значит это не является простым
         */
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число, до которого нужно вывести простые числа:");
        int a = str.nextInt();
        for (int z = 2; z <= a; z++) {
            boolean isSimple = true;
            for (int i = 2; i < z; i++) {

                if ((z % i) == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) System.out.println(z);
        }
    }
}
