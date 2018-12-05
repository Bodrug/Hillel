package ua.hillel.bodrug.lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*Не совсем понял условие расчета конечного депозита, поэтому наверняка неправильно.*/
        int x = 0;
        Scanner info = new Scanner(System.in);
        System.out.println("Введите свой возраст:");
        int age = info.nextInt();
        System.out.println("Введите возраст выхода на пенсию:");
        int pens = info.nextInt();
        System.out.println("Введите сумму первоначального взноса:");
        int dep = info.nextInt();
        System.out.println("Введите сумму ежемесячного взноса:");
        int monthSumm = info.nextInt();
        System.out.println("Введите процентную ставку:");
        int perc = info.nextInt();
        while (age <= pens){
            System.out.println(age + " *****************");
            for (int i = 0; i < 12; i++) {
                x = dep*(perc/100)/12;
                dep = dep + monthSumm + x;
            }
            System.out.println(dep);
            age++;
        }
        System.out.println("------------------");
        System.out.println(x);
    }

}
