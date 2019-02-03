package ua.hillel.bodrug.lesson12.dao.staticDao;

import ua.hillel.bodrug.lesson12.dao.interfaces.HomeWorkDao;
import ua.hillel.bodrug.lesson12.dao.interfaces.LessonDao;
import ua.hillel.bodrug.lesson12.model.HomeWork;
import ua.hillel.bodrug.lesson12.model.Lesson;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HomeWorkDaoImpl implements HomeWorkDao {
    static private Map<Integer, HomeWork> homeWorks = new LinkedHashMap<>();
    static private int i = 0;

    @Override
    public HomeWork create(HomeWork homeWork) {
        int id = i++;
        homeWork.setId(id);
        homeWorks.put(id, homeWork);
        return homeWork;
    }

    @Override
    public void update(HomeWork homeWork) {
        Integer id = homeWork.getId();
        homeWorks.put(id,homeWork);
    }

    @Override
    public void delete(HomeWork homeWork) {
        homeWorks.remove(homeWork.getId());
    }

    @Override
    public HomeWork findById(Integer id) {
        return homeWorks.get(id);
    }

    @Override
    public List<HomeWork> getAll() {
        return new ArrayList<>(homeWorks.values());
    }
}
