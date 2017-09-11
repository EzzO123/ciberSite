package by.usovich.service.Imp;

import by.usovich.dao.NewsDaoInterface;
import by.usovich.dto.NewsDto.NewsDto;
import by.usovich.dto.NewsDto.NewsJsonDto;
import by.usovich.entity.NewsEntity;
import by.usovich.service.NewsServiceInterface;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.LinkedList;




/**
 * Created by yanus on 15.05.2017.
 */
@Service("newsService")
public class NewsServiceImplement implements NewsServiceInterface {


    @Autowired
    public NewsDaoInterface PostDaoImp;

    private static final Logger log = Logger.getLogger(NewsServiceImplement.class);

    public NewsJsonDto getNewsAtNameGame(String nameTheme, String numberOfPosts) {//получение множества последних постов

        int numberPosts = Integer.parseInt(numberOfPosts);

        NewsJsonDto postsJsonDto = new NewsJsonDto();

        if (getNameTablePost(nameTheme).equals("")) {

            //Debbug


        } else {

            List postsEntity = null;//список постов для парса в Map(Controller)
            postsEntity = PostDaoImp.getNewsAtTitel(getNameTablePost(nameTheme));

            if (postsEntity.size() == 0) {

                log.error("Сущность не получена");

            } else {

                log.info("Сущность получена");

                for (int temp = 0; temp < numberPosts; temp++) {//получение последних постов добавленных в БД

                    int sizeList = postsEntity.size();

                    if (sizeList < numberPosts) {


                        numberPosts = numberPosts - (numberPosts - sizeList);

                    }

                    postsJsonDto.putPost(getPostEntityInPostDto((NewsEntity) postsEntity.get(sizeList - temp - 1)));//Получение из списка ENITITYpost в DTOpost
                }
            }

        }


        return postsJsonDto;//DAO
    }

    private String getTitelFromTheme(String theme) {//Получение темы с сайта Cibersite со своим Titel

        switch (theme.charAt(0)) {
            case '1':
                return "cs";
            case '2':
                return "paragon";
            case '3':
                return "dota";
            case '4':
                return "wot";
            case 'c':
                return "cs";
            case 'p':
                return "paragon";
            case 'd':
                return "dota";
            case 'w':
                return "wot";
            default:
                return "wot";
        }
    }



    @Override
    public NewsJsonDto getNewsAtNameGame(String nameTheme, String newsDeriction,String numberOfPosts, HttpSession session) {//получение множества постов


        String titel = getTitelFromTheme(nameTheme);

        int displayedNews = correctNewsDeriction(newsDeriction,(int)session.getAttribute("indexNews"));

        int numberPosts = Integer.parseInt(numberOfPosts);

        NewsJsonDto newsJsonDto = new NewsJsonDto();

        if(!getNameTablePost(titel).equals("")){

            //Debbug
            log.info("True");

            List newsEntity = null;//список постов для парса в Map(Controller)
            newsEntity = PostDaoImp.getNewsAtTitel(getNameTablePost(titel));

            if (newsEntity.size() == 0) {

                log.error("Сущность не получена");

            } else {

                log.info("Сущность получена");

                if ((displayedNews + 3 <= newsEntity.size()) && ((displayedNews % 3) == 0) ||
                        ((displayedNews == 0) && (displayedNews + 3 <= newsEntity.size()))) {

                    getLastNews(displayedNews, newsEntity, newsJsonDto);
                    session.setAttribute("indexNews",displayedNews);

                } else {

                    getLastNews(displayedNews - 3, newsEntity, newsJsonDto);
                    session.setAttribute("indexNews",displayedNews-3);

                }
            }
        }
        return newsJsonDto;//DAO
    }

    private int correctNewsDeriction(String newsDeriction, int displayedOfNews) {//определяет показаные посты

        if (newsDeriction.equals("next")) {
            displayedOfNews += 3;
        } else {
            if (newsDeriction.equals("priv")) {
                displayedOfNews -= 3;
            } else {
                displayedOfNews = 3;
            }
        }
        return displayedOfNews;

    }

    private void getLastNews(int displayedNews, List newsEntity, NewsJsonDto newsJsonDto) {//получение последних постов добавленных в БД

        for (int temp = displayedNews; displayedNews + 3 > temp; temp++) {//получение последних постов добавленных в БД

            int sizeList = newsEntity.size();

            newsJsonDto.putPost(getPostEntityInPostDto((NewsEntity)
                    newsEntity.get(sizeList - temp - 1)));//Получение из списка ENITITYpost в DTOpost


        }
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
    private NewsDto getPostEntityInPostDto(NewsEntity postEntity){

        if(false){
            return null;
        }else{
            return new NewsDto(postEntity.get_titel(),postEntity.get_content(),
                    postEntity.get_date(),postEntity.get_image(),postEntity.get_id() +"");
        }

    }



    public void addJson(NewsDto post, LinkedList<NewsDto> posts) {

        posts.add(post);

    }

}
