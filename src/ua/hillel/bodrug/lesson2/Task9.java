package ua.hillel.bodrug.lesson2;

public class Task9 {
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
