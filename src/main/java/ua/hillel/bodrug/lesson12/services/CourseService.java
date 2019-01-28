
package ua.hillel.bodrug.lesson12.services;

import ua.hillel.bodrug.lesson12.dao.interfaces.CourseDao;
import ua.hillel.bodrug.lesson12.dao.staticDao.CourseDaoImpl;
import ua.hillel.bodrug.lesson12.model.Course;
import ua.hillel.bodrug.lesson12.model.Lesson;
import ua.hillel.bodrug.lesson12.model.Student;

import java.util.List;

public class CourseService {
    private static CourseDao courseDao = new CourseDaoImpl();
    public static Course saveAllCourse(Course course){
        List<Lesson> lessons = course.getLessons();
        List<Student> students = course.getStudents();
        return courseDao.create(course);

    }
}

