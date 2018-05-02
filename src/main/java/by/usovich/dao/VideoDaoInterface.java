package by.usovich.dao;

import by.usovich.entity.StreamEntity;
import by.usovich.entity.VideoEntity;

import java.util.List;

/**
 * Created by yanus on 8/19/2017.
 */
public interface VideoDaoInterface {

    public List getVideoAtTitel(String nameGameTable);

    void createVideo(VideoEntity videoEntity);

    public void deleteStream(StreamEntity streamEntity);
}
