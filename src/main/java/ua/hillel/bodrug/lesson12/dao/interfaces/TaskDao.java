package ua.hillel.bodrug.lesson12.dao.interfaces;
import ua.hillel.bodrug.lesson12.model.Task;

import java.util.List;

public interface TaskDao {
    Task create(Task task);
    void update(Task task);
    void delete(Task task);
    Task findById(Integer id);
    List<Task> getAll();
}
