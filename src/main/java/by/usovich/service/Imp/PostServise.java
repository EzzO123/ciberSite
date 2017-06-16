package by.usovich.service.Imp;

import by.usovich.dao.IMP.PostDaoInterface;
import by.usovich.dto.PostJson;
import by.usovich.entity.PostEntity;
import by.usovich.entity.PostEntityForTest;
import by.usovich.service.PostServiceInterface;
import javafx.geometry.Pos;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;




/**
 * Created by yanus on 15.05.2017.
 */
@Service("postService")
public class PostServise implements PostServiceInterface {



    @Autowired
    public PostDaoInterface PostDaoImp;

    public LinkedList<PostJson> getPostAtNameGame(String nameTheme, int numberOfPosts) {

        LinkedList<PostJson> posts = new LinkedList<PostJson>();//список постов для парса в Map(Controller)

        for(int i = 0;i<numberOfPosts;i++){

            //DAO.getPostEntity
        }

        return null;//DAO
    }
    public PostJson getPostAtNameGame(String nameTheme){//

        System.out.println("2) : Service");
        PostJson postJson = null;

        if(getNameTablePost(nameTheme).equals("")) {

            //Debug

        }else{
            PostEntity postEntityForTest = null;
            postEntityForTest = PostDaoImp.getPostAtTitel(getNameTablePost(nameTheme));//Шаг 1:Получение Entity из БД

            if(postEntityForTest == null) {

                //Debug

            }else{
                postJson = getPostEntityInPostJson(postEntityForTest);//Шаг 2:Парс Entity в DTO
            }
        }
        System.out.println("5) : Service(return)");
        return postJson;
    }


    private String getNameTablePost(String nameGame) {

        if (nameGame.equals("paragon")) {
            return "tablePARAGON";
        }
        if (nameGame.equals("cs")) {
            return "tableCS";
        }
        if (nameGame.equals("dota")) {
            return "tableDOTA";
        }
        if (nameGame.equals("wot")) {
            return "tableWOT";
        }

        return "";
    }

    //Получение из PostEntity в PostJson
    private PostJson getPostEntityInPostJson(PostEntity postEntity){

        if(false){
            return null;
        }else{
            return new PostJson(postEntity.get_titel(),postEntity.get_content(),
                    postEntity.get_date(),postEntity.get_image());
        }

    }



    public void addJson(PostJson post, LinkedList<PostJson> posts) {

        posts.add(post);

    }

}

//    JSONArray jsonArray = new JSONArray();
//    JSONObject object_1;
//    JSONObject object_2;
//    JSONObject object_3;
//
//       object_1 = new JSONObject();
//               object_2 = new JSONObject();
//               object_3 = new JSONObject();
//
//               try{
//
//               object_1.put("titel",post_1.get_titel());
//               object_1.put("content",post_1.get_content());
//
//               object_2.put("titel",post_2.get_titel());
//               object_2.put("content",post_2.get_content());
//
//               object_3.put("titel",post_3.get_titel());
//               object_3.put("content",post_3.get_content());
//
//               jsonArray.put(object_1);
//               jsonArray.put(object_2);
//               jsonArray.put(object_3);
//
//
//               }catch (JSONException exception){
//
//               System.out.printf("" + exception);
//               }