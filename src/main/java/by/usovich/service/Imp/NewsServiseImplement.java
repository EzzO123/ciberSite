package by.usovich.service.Imp;

import by.usovich.dao.PostDaoInterface;
import by.usovich.dto.PostDto;
import by.usovich.dto.PostsJsonDto;
import by.usovich.entity.PostEntity;
import by.usovich.service.PostServiceInterface;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.LinkedList;




/**
 * Created by yanus on 15.05.2017.
 */
@Service("postService")
public class PostServiseImplement implements PostServiceInterface {



    @Autowired
    public PostDaoInterface PostDaoImp;

    private static final Logger log = Logger.getLogger(PostServiseImplement.class);

    public PostsJsonDto getPostAtNameGame(String nameTheme, String numberOfPosts) {//получение множества постов

        int numberPosts = Integer.parseInt(numberOfPosts);

        PostsJsonDto postsJsonDto = new PostsJsonDto();

        if(getNameTablePost(nameTheme).equals("")){

            //Debbug


        }else {

            List postsEntity = null;//список постов для парса в Map(Controller)
            postsEntity = PostDaoImp.getPostAtTitel(getNameTablePost(nameTheme));

            if(postsEntity == null){

                log.error("Сущность не получена");

            }else{

                log.info("Сущность получена");

                for(int temp = 0;temp < numberPosts;temp++){//получение последних постов добавленных в БД

                    int sizeList = postsEntity.size();

                    if(sizeList < numberPosts){


                        numberPosts = numberPosts - (numberPosts - sizeList);

                    }

                    postsJsonDto.putPost(getPostEntityInPostDto((PostEntity) postsEntity.get(sizeList-temp-1)));//Получение из списка ENITITYpost в DTOpost
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
    private PostDto getPostEntityInPostDto(PostEntity postEntity){

        if(false){
            return null;
        }else{
            return new PostDto(postEntity.get_titel(),postEntity.get_content(),
                    postEntity.get_date(),postEntity.get_image());
        }

    }



    public void addJson(PostDto post, LinkedList<PostDto> posts) {

        posts.add(post);

    }

}
