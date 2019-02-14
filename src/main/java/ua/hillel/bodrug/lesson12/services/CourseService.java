
package ua.hillel.bodrug.lesson12.services;

import ua.hillel.bodrug.lesson12.dao.interfaces.CourseDao;
import ua.hillel.bodrug.lesson12.dao.staticDao.CourseDaoImpl;
import ua.hillel.bodrug.lesson12.model.Course;
import ua.hillel.bodrug.lesson12.model.Lesson;
import ua.hillel.bodrug.lesson12.model.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CourseService {
    private static CourseDao courseDao = new CourseDaoImpl();
    public static Course saveAllCourse(Course course){
        List<Lesson> lessons = course.getLessons();
        List<Student> students = course.getStudents();
        return courseDao.create(course);

    }
    //@Override
    public void byteCopy(Course course) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/home/hillel/Bodrug/hillel/course"+course.getId()+".txt");
            out = new FileOutputStream("/home/hillel/Bodrug/hillel/course"+course.getId()+".txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}

