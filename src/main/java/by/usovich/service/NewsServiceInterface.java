package by.usovich.service;

import by.usovich.dto.NewsDto.NewsJsonDto;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 15.05.2017.
 */
public interface NewsServiceInterface {

    public NewsJsonDto getNewsAtNameGame(String nameTheme, String numberOfPosts);

    public NewsJsonDto getNewsAtNameGame(String nameTheme,String newsDeriction, String numberOfPosts, HttpSession session);

}