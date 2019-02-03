package ua.hillel.bodrug.lesson12.dao.interfaces;
import ua.hillel.bodrug.lesson12.model.HomeWork;

import java.util.List;

public interface HomeWorkDao {
    HomeWork create(HomeWork homeWork);
    void update(HomeWork homeWork);
    void delete(HomeWork homeWork);
    HomeWork findById(Integer id);
    List<HomeWork> getAll();
}
