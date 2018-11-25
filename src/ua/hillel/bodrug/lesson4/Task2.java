package ua.hillel.bodrug.lesson4;
/*
Задача на поиск банки с таблетками неправильного веса
 */
public class Task2 {
    public static void main(String[] args) {
        int arr[] = {10,10,10,11,10,10,10,10,10,10};
        int x = SearchUnnormCup(arr);
        if (x==0){
            System.out.println("Банки с непраильным весом нет.");
        }
        else {
            System.out.println("Таблетки с неправильным весом находятся в банке №" + x);
        }
    }

    public static int SearchUnnormCup(int[] a){
        /*Описание решения задачи:
        -Берем из первой банки 1 табл., из второй 2 табл., из третьей 3 табл. и т.д.
        -Взвешиваем все отобранные таблетки.
        -По у молчанию нам изестно, что эталонный вес каждой таблетки 10г
        -поэтому получив остаток от деления суммарного веса отобранных таблеток на 10 поучим номер искомой банки*/
        int summWeight = 0;
        int idealWeight = 0;
        for (int i=1; i<=a.length; i++) {
            idealWeight = idealWeight + 10 * i;
            summWeight = summWeight + a[i-1]*i;
        }
        if (idealWeight==summWeight){
            return 0;
        }

        int x = summWeight%10;
        if (x==0) return a.length;
        else return x;
    }
}
