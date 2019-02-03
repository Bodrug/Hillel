package ua.hillel.bodrug.lesson12.dao.interfaces;
import ua.hillel.bodrug.lesson12.model.Lesson;

import java.util.List;

public interface LessonDao {
    Lesson create(Lesson course);
    void update(Lesson course);
    void delete(Lesson course);
    Lesson findById(Integer id);
    List<Lesson> getAll();
}
