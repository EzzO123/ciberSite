package by.usovich.dto;



import java.util.*;

/**
 * Created by yanus on 6/17/2017.
 */
public class PostsJsonDto{

    public PostsJsonDto() {
    }


    int counter = 0;
    Map<String,PostJsonDto> map = new LinkedHashMap<String, PostJsonDto>();




    public Map<String, PostJsonDto> getMap() {
        return map;
    }

    public void putPost(PostJsonDto post){

        map.put(counter + "",post);
        counter++;
    }

}
