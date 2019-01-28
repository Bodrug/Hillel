package ua.hillel.bodrug.lesson6;

import java.io.Serializable;
import java.util.Objects;

public class Lessons{
    public String name;
    public Tasks task;

    public Lessons(String name, Tasks task) {
        this.name = name;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "name='" + name + '\'' +
                ", task=" + task +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lessons lessons = (Lessons) o;
        return Objects.equals(name, lessons.name) &&
                Objects.equals(task, lessons.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, task);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tasks getTask() {
        return task;
    }

    public void setTask(Tasks task) {
        this.task = task;
    }
}
