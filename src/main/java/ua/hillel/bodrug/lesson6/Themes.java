package ua.hillel.bodrug.lesson6;

import java.util.Objects;

public class Themes {
    public String name;

    @Override
    public String toString() {
        return "Themes{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Themes themes = (Themes) o;
        return Objects.equals(name, themes.name);
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

    public Themes(String name) {

        this.name = name;
    }
}
