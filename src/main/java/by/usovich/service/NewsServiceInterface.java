package by.usovich.service;

import by.usovich.dto.PostsJsonDto;

/**
 * Created by yanus on 15.05.2017.
 */
public interface PostServiceInterface {

    public PostsJsonDto getPostAtNameGame(String nameTheme, String numberOfPosts);

}