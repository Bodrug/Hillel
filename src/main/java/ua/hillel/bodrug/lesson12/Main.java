package ua.hillel.bodrug.lesson12;


/*
        Создать систему классов школы Hillel.
        В системе должны присутствовать курсы,студенты,преподаватели,
         уроки, темы уроков,
        задания .
        Предусмотреть что преподаватель может вести несколько курсов и студент
        может посещать несколько курсов. Также создать методы для просмотра
        выполненных заданий для студента и для преподавателя по студентам.
*/


import ua.hillel.bodrug.lesson12.model.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Task(x, "Task " + x)
                ).collect(Collectors.toList());

        List<Lesson> lessons = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Lesson(x, "Lesson " + x)
                ).collect(Collectors.toList());

        List<Student> students = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Student(x, "Student " + x,
                        getHomeworks(lessons, tasks))
                ).collect(Collectors.toList());

        List<Course> courses = IntStream.rangeClosed(1, 2)
                .mapToObj(x ->
                        new Course(x, "course " + x, lessons,
                                new Teacher(x, "Teacher"+x), students, tasks)
                ).collect(Collectors.toList());


        for (Course cours : courses) {
            System.out.println(cours.getTeacher().getName());
            cours.showHomework();
            System.out.println("------------------------");
            System.out.println("------------------------");
        }



    }

    private static List<HomeWork> getHomeworks(
            List<Lesson> lessons,
            List<Task> tasks) {
        int id = 1;
        List<HomeWork> result = new ArrayList<>();
        for (Lesson lesson : lessons) {
            for (Task task : tasks) {
                result.add(new HomeWork(id++, lesson
                        , task));
            }
        }
        return result;
    }

    /*private static List<HomeWork> getHomeworks2(
            List<Lesson> lessons,
            List<Task> tasks) {
        int id = 1;
        List<HomeWork> collect = lessons.stream()
                .flatMap(lesson -> tasks.stream()
                        .map(task -> new HomeWork(lesson, task)))
                .collect(Collectors.toList());
        for (HomeWork homeWork : collect) {
            homeWork.setId(id++);
        }
        return collect;

    }*/

}