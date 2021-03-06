package ua.hillel.bodrug.lesson6;

import ua.hillel.bodrug.lesson12.model.Teacher;

import java.util.Objects;

public class Teachers{
    public String name;

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teachers teachers = (Teachers) o;
        return Objects.equals(name, teachers.name);
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

    public Teachers(String name) {

        this.name = name;
    }
}
