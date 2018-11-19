package ua.hillel.Bodrug.Lesson2.Task9;

public class Task9Class {
    public static void main(String[] args) {
        int s = 1;
        int[] a = {1,2,3,4,5,6};
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2!=0){
                s = s*a[i];
            }
        }
        System.out.println(s);
    }
}
