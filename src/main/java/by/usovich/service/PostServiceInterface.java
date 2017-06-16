package by.usovich.service;

import by.usovich.dto.PostJson;
import org.json.JSONArray;

import java.util.LinkedList;

/**
 * Created by yanus on 15.05.2017.
 */
public interface PostServiceInterface {

    public LinkedList<PostJson> getPostAtNameGame(String nameTheme, int numberOfPosts);

    public PostJson getPostAtNameGame(String nameTheme);

}