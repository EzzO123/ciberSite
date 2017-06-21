package by.usovich.service;

import by.usovich.dao.IMP.PostDaoInterface;
import by.usovich.dto.PostJsonDto;
import by.usovich.dto.PostsJsonDto;

import java.util.LinkedList;

/**
 * Created by yanus on 15.05.2017.
 */
public interface PostServiceInterface {

    public PostsJsonDto getPostAtNameGame(String nameTheme, String numberOfPosts);

}