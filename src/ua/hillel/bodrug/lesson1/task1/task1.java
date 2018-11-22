package ua.hillel.bodrug.lesson1.task1;

public class task1 {
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
