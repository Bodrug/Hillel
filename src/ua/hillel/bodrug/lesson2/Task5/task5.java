package ua.hillel.bodrug.lesson2.Task5;

public class task5 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}