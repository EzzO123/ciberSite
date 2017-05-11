package by.usovich.dao;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yanus on 10.05.2017.
 */
public interface UserDAOinterface<T> {

    public List<T> findAll();
}
