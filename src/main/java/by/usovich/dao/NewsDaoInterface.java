package by.usovich.dao;

import by.usovich.entity.NewsEntity;

import java.util.*;

/**
 * Created by yanus on 15.05.2017.
 */
public interface NewsDaoInterface {

    public List getNewsAtTitel(String nameGameTable);

    void createNews(NewsEntity newsEntity);

    public void deleteNews(NewsEntity newsEntity);

}
