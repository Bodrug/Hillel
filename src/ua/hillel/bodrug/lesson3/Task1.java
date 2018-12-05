package ua.hillel.bodrug.lesson3;

public class Task1 {
    public static void main(String[] args) {
        countSymbols();
    }

    public static void countSymbols(){
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
