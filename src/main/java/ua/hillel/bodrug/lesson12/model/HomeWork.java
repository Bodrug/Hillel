package ua.hillel.bodrug.lesson12.model;

public class HomeWork {

    private Integer id;
    private Lesson lesson;
    private Task task;
    private Integer mark;

    public HomeWork(Integer id, Lesson lesson, Task task) {
        this.id = id;
        this.lesson = lesson;
        this.task = task;
    }
    public HomeWork(Lesson lesson, Task task) {
        this.id = id;
        this.lesson = lesson;
        this.task = task;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "id=" + id +
                ", lesson=" + lesson +
                ", task=" + task +
                ", mark=" + mark +
                '}';
    }
}