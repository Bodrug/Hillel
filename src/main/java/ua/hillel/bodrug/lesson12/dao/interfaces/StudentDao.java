package ua.hillel.bodrug.lesson12.dao.interfaces;
import ua.hillel.bodrug.lesson12.model.Student;

import java.util.List;

public interface StudentDao {
    Student create(Student student);
    void update(Student student);
    void delete(Student student);
    Student findById(Integer id);
    List<Student> getAll();
}
