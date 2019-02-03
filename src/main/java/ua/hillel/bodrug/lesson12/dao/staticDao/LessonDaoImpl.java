package ua.hillel.bodrug.lesson12.dao.staticDao;

import ua.hillel.bodrug.lesson12.dao.interfaces.LessonDao;
import ua.hillel.bodrug.lesson12.model.Lesson;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LessonDaoImpl implements LessonDao {
    static private Map<Integer, Lesson> lessons = new LinkedHashMap<>();
    static private int i = 0;

    @Override
    public Lesson create(Lesson course) {
        int id = i++;
        course.setId(id);
        lessons.put(id, course);
        return course;
    }

    @Override
    public void update(Lesson course) {
        Integer id = course.getId();
        lessons.put(id,course);
    }

    @Override
    public void delete(Lesson course) {
        lessons.remove(course.getId());
    }

    @Override
    public Lesson findById(Integer id) {
        return lessons.get(id);
    }

    @Override
    public List<Lesson> getAll() {
        return new ArrayList<>(lessons.values());
    }
}
