package ua.hillel.Bodrug.Lesson3.Task1;

public class Task1Class {
    public static void main(String[] args) {
        int countSpace = 0;
        int countStars = 0;
        String a =
                "* * * *     * * * *\n"+
                "*      *       *\n"+
                "*      *       *\n"+
                "*      *       *\n"+
                "* * * *        *\n"+
                "* * * *        *\n"+
                "*      *       *\n"+
                "*      *       *\n"+
                "*      *       *\n"+
                "* * * *     * * * *";
        System.out.println(a);
        for(char s : a.toCharArray()){
            if (s == ' '){
                countSpace++;
            }
            if (s == '*'){
                countStars++;
            }
        }
        System.out.println("Пробелов:"+countSpace);
        System.out.println("Звездочек:"+countStars);
    }
}
