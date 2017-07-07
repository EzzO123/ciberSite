package by.usovich.dto;



import java.util.*;
import org.json.*;
/**
 * Created by yanus on 6/17/2017.
 */
public class PostsJsonDto{

    public PostsJsonDto() {
    }


    int counter = 0;
    Map<String,PostJsonDto> map = new LinkedHashMap<String, PostJsonDto>();

    JSONArray jsonArray = new JSONArray();



    public Map<String, PostJsonDto> getMap() {

        return map;
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void putPost(PostJsonDto post){

        putPostInMap(post);
        putPostInJson(post);

    }

    public void putPostInMap (PostJsonDto post){


        map.put(counter + "",post);
        counter++;
    }

    public void putPostInJson (PostJsonDto post){
        try {
           // jsonObject.put("Id", counter + "");
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("titel",post.get_titel());
            jsonObject.put("content",post.get_content());
            jsonObject.put("date",post.get_date());
            jsonObject.put("image",post.get_image());

            jsonArray.put(jsonObject);

        }catch (JSONException E){

            System.out.println("Errro in Dto(Post) : problem with parse object to json");

        }
      //  map.put(counter + "",post);
        counter++;
    }

}
