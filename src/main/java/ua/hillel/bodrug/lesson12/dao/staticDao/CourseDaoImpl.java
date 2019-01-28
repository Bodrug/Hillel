package ua.hillel.bodrug.lesson12.dao.staticDao;

import ua.hillel.bodrug.lesson12.dao.interfaces.CourseDao;
import ua.hillel.bodrug.lesson12.model.Course;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseDaoImpl implements CourseDao{
    static private Map<Integer, Course> courses = new LinkedHashMap<>();
    static private int i = 0;

    @Override
    public Course create(Course course) {
        int id = i++;
        course.setId(id);
        courses.put(id, course);
        return course;
    }

    @Override
    public void update(Course course) {
        Integer id = course.getId();
       courses.put(id,course);
    }

    @Override
    public void delete(Course course) {
        courses.remove(course.getId());
    }

    @Override
    public Course findById(Integer id) {
        return courses.get(id);
    }

    @Override
    public List<Course> getAll() {
        return new ArrayList<>(courses.values());
    }
}
