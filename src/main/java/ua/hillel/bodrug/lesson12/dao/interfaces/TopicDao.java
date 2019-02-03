package ua.hillel.bodrug.lesson12.dao.interfaces;
import ua.hillel.bodrug.lesson12.model.Teacher;
import ua.hillel.bodrug.lesson12.model.Topic;

import java.util.List;

public interface TopicDao {
    Topic create(Topic topic);
    void update(Topic topic);
    void delete(Topic topic);
    Topic findById(Integer id);
    List<Topic> getAll();
}
