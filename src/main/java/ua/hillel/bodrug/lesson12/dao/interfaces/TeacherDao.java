package ua.hillel.bodrug.lesson12.dao.interfaces;
import ua.hillel.bodrug.lesson12.model.Task;
import ua.hillel.bodrug.lesson12.model.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher create(Teacher teacher);
    void update(Teacher teacher);
    void delete(Teacher teacher);
    Teacher findById(Integer id);
    List<Teacher> getAll();
}
