package ua.hillel.bodrug.lesson3;

public class Task3 {
    public static boolean checkPalindrom(String pal){
        boolean isPalindrom = false;
        for (int i = 0; i < pal.length(); i++) {
            if (pal.charAt(i) == pal.charAt(pal.length()-i-1)){
                isPalindrom = true;
            }
        }
        return isPalindrom;
    }
}
