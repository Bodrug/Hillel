package ua.hillel.bodrug.lesson1;

import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args) {
        String[][] a = new String[][]
                {
                        {"*", "*", "*", " ", "*", "*", "*", " "},
                        {" ", "*", " ", " ", "*", " ", " ", "*"},
                        {" ", "*", " ", " ", "*", "*", "*", " "},
                        {" ", "*", " ", " ", "*", " ", " ", "*"},
                        {"*", "*", "*", " ", "*", "*", "*", " "},
                };
        for (String[] anA : a) {
            for (String anAnA : anA) {

                out.print(anAnA);
            }
            out.println();
        }
    }
}
