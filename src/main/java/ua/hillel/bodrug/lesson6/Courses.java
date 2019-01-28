package ua.hillel.bodrug.lesson6;

import ua.hillel.bodrug.lesson12.model.Lesson;
import ua.hillel.bodrug.lesson12.model.Teacher;

import java.io.Serializable;
import java.util.Objects;

public class Courses implements Serializable {
    public String name;
    public  Teachers teacher;
    public Lessons lesson;
    public Students student;

    public Courses(Lessons lesson) {
        this.lesson = lesson;
    }

    public Courses(Teachers teacher) {
        this.teacher = teacher;
    }

    public Courses(Students student) {
        this.student = student;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Lessons getLesson() {
        return lesson;
    }

    public void setLesson(Lessons lesson) {
        this.lesson = lesson;
    }

    public Courses(String name, Teachers teacher, Students student, Lessons lesson) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
                ", lesson=" + lesson +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return Objects.equals(name, courses.name) &&
                Objects.equals(teacher, courses.teacher) &&
                Objects.equals(student, courses.student) &&
                Objects.equals(lesson, courses.lesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher, student, lesson);
    }
}
