package ua.hillel.bodrug.lesson12.dao.staticDao;

import ua.hillel.bodrug.lesson12.dao.interfaces.TopicDao;
import ua.hillel.bodrug.lesson12.model.Topic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TopicDaoImpl implements TopicDao {
    static private Map<Integer, Topic> topics = new LinkedHashMap<>();
    static private int i = 0;

    @Override
    public Topic create(Topic topic) {
        int id = i++;
        topic.setId(id);
        topics.put(id, topic);
        return topic;
    }

    @Override
    public void update(Topic topic) {
        Integer id = topic.getId();
        topics.put(id,topic);
    }

    @Override
    public void delete(Topic topic) {
        topics.remove(topic.getId());
    }

    @Override
    public Topic findById(Integer id) {
        return topics.get(id);
    }

    @Override
    public List<Topic> getAll() {
        return new ArrayList<>(topics.values());
    }
}
