package by.usovich.service.Imp;

import by.usovich.dao.IMP.PostDaoInterface;
import by.usovich.dto.PostJsonDto;
import by.usovich.dto.PostsJsonDto;
import by.usovich.entity.PostEntity;
import by.usovich.service.PostServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.LinkedList;




/**
 * Created by yanus on 15.05.2017.
 */
@Service("postService")
public class PostServise implements PostServiceInterface {



    @Autowired
    public PostDaoInterface PostDaoImp;

    public PostsJsonDto getPostAtNameGame(String nameTheme, String numberOfPosts) {//получение множества постов

        int numberPosts = Integer.parseInt(numberOfPosts);

        PostsJsonDto postsJsonDto = new PostsJsonDto();

        if(getNameTablePost(nameTheme).equals("")){

            //Debbug

        }else {

            List postsEntity = null;//список постов для парса в Map(Controller)
            postsEntity = PostDaoImp.getPostAtTitel(getNameTablePost(nameTheme));

            if(postsEntity == null){

                //Debbug

            }else{

                for(Object obj:postsEntity) {
                    postsJsonDto.putPost(getPostEntityInPostJson((PostEntity)obj));
                }
            }

        }



        return postsJsonDto;//DAO
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
    private PostJsonDto getPostEntityInPostJson(PostEntity postEntity){

        if(false){
            return null;
        }else{
            return new PostJsonDto(postEntity.get_titel(),postEntity.get_content(),
                    postEntity.get_date(),postEntity.get_image());
        }

    }



    public void addJson(PostJsonDto post, LinkedList<PostJsonDto> posts) {

        posts.add(post);

    }

}
