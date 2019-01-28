package ua.hillel.bodrug.lesson6;

import java.util.Objects;

public class Tasks {
    public String Name;

    @Override
    public String toString() {
        return "Tasks{" +
                "Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return Objects.equals(Name, tasks.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Tasks(String name) {

        Name = name;
    }
}
