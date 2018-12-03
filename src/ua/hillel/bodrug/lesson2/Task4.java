package ua.hillel.bodrug.lesson2;

public class Task4 {
    public static void main(String[] args) {
        int n = 15;
        int mod;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i+1;
            mod = i%3;
            if (mod==0){
                System.out.println(i);
            }
        }
    }
}
