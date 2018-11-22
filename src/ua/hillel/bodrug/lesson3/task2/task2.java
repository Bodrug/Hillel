package ua.hillel.bodrug.lesson3.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Введите число:");
        int i = text.nextInt();
        int y = 0;
        int count = 0;
        String s="";
        while (i!=0){

            y = i%2;
            i = i/2;
            if(y>0){
                s = s + "1";
                count++;
            }
            if(y==0){
                s = s + "0";
            }
        }
        System.out.println("В двоичном виде = "+s);
        System.out.println("Количество единиц = " +count);
    }
}
