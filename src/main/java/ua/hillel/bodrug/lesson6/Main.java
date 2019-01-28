package ua.hillel.bodrug.lesson6;


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Students student = new Students("Student"+i);
            System.out.println(student.toString());
        }

        for (int j = 0; j < 10; j++) {
            Lessons lesson = new Lessons("Lesson"+j, new Tasks("Task"+j));
            System.out.println(lesson.toString());
        }

        for (int t = 0; t < 5; t++) {
            Teachers teacher = new Teachers("Teacher"+t);
            System.out.println(teacher.toString());

        }

        for (int k = 0; k < 10; k++) {
            Themes theme = new Themes("Theme"+k);
            System.out.println(theme.toString());

        }
    }

}
