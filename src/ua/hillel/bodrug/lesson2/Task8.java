package ua.hillel.bodrug.lesson2;

public class Task8 {
    public static void main(String[] args) {
        int[] a = {0, -1, 4, 22, -10};
        if(a.length==0){
            System.out.println("Длина массива = 0!");
        }
        else {
            int max = a[0];
            int min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
                if (min > a[i]) {
                    min = a[i];
                }
            }
            int s = max + min;
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
            System.out.println("SummMaxMin = " + s);
        }
    }
}
