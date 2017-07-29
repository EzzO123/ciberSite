package by.usovich.service;

import by.usovich.dto.NewsDto.NewsJsonDto;

/**
 * Created by yanus on 15.05.2017.
 */
public interface NewsServiceInterface {

    public NewsJsonDto getPostAtNameGame(String nameTheme, String numberOfPosts);

}