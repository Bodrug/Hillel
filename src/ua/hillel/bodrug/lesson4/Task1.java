package ua.hillel.bodrug.lesson4;

import java.util.Arrays;
/*
Задача на добаление элемента в массив и сортировку нового массива (сортируем пузырьковым методом)
 */
public class Task1 {
    public static void main(String[] args) {
        int [] a = {1,2,4,5,6};
        int b = 3;
        int[] newArray = getNewArray(a,b);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] getNewArray(int[] a, int b){
        int[]arr = new int[a.length+1];
        for (int i = 0; i < a.length ; i++) {
            arr[i] = a[i];
        }
        arr[a.length] = b;
        return bubbleSort(arr);
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = arr.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    return arr;
    }
}
