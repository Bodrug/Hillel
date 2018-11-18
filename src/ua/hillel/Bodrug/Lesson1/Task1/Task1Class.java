package ua.hillel.Bodrug.Lesson1.Task1;

public class Task1Class {
    public static void main(String[] args) {
        String[][] a = new String[][]
                {
                        {"*", "*", "*", " ", "*", "*", "*", " "},
                        {" ", "*", " ", " ", "*", " ", " ", "*"},
                        {" ", "*", " ", " ", "*", "*", "*", " "},
                        {" ", "*", " ", " ", "*", " ", " ", "*"},
                        {"*", "*", "*", " ", "*", "*", "*", " "},
                };
        for (int i = 0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){

                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
