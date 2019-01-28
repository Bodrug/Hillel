package ua.hillel.bodrug.lesson6;

import java.util.Objects;

public class Students {
    public String name;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name) {

        this.name = name;
    }
}
