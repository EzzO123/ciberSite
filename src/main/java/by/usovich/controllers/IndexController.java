package by.usovich.controllers;

import by.usovich.dto.StreamAndVideoDto.CreateStreamAndVideoDto;
import by.usovich.dto.NewsDto.CreateNewsDto;
import by.usovich.service.Imp.SreamsVideoNewsCreatorServiceImlement;
import by.usovich.service.StreamServiceInterface;
import by.usovich.service.VideoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 8/7/2017.
 */
@Controller
public class IndexController {

    @Autowired
    public VideoServiceInterface videoServiceImp;

    @Autowired
    public StreamServiceInterface streamServiceImp;

    @Autowired
    public SreamsVideoNewsCreatorServiceImlement sreamsVideoNewsCreatorServiceImlement;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getNewPage( HttpSession session, Model model){

        return "createStreamsAndVideo";

       // return "index";
    }

    @RequestMapping(value = "main-page-wot",method = RequestMethod.GET)
    public String getMainPageWot(HttpSession session,Model model){

        String number = "8";

        String titel = "wot";

        model.addAttribute("Video",   videoServiceImp.getVideoAtNameGame(8,titel,number).getMap());
        System.out.println(videoServiceImp.getVideoAtNameGame(8,titel,number).getMap().toString());
        model.addAttribute("Stream",   streamServiceImp.getStreamAtNameGame(titel,number).getMap());

        return "mainPageWot";
    }

    @RequestMapping(value = "main-page-cs",method = RequestMethod.GET)
    public String getMainPageDota(HttpSession session){

        return "mainPageCs";
    }

    @RequestMapping(value = "main-page-paragon",method = RequestMethod.GET)
    public String getMainPageCs(HttpSession session){

        return "mainPageParagon";
    }

    @RequestMapping(value = "main-page-dota",method = RequestMethod.GET)
    public String getMainPageParagon(HttpSession session){

        return "mainPageDota";
    }


    @RequestMapping( value = "/createSteamOrVideoPage", method = RequestMethod.GET)
    public String getCreateStreanAndVideoPage(HttpSession session) {

        System.out.println("Get page for create Stream and Video");
        return "createStreamsAndVideo";
    }

    @RequestMapping( value = "/createNewsPage", method = RequestMethod.GET)
    public String getCreateNewsPage(HttpSession session) {

        System.out.println("Get page for create News");
        return "createNews";
    }

    @RequestMapping( value = "/deletePostsPage", method = RequestMethod.GET)
    public String getDeletePostsPage(HttpSession session) {

        System.out.println("Get page for delete Posts");
        return "deletePosts";
    }


    @RequestMapping( value = "/createSteamOrVideo", method = RequestMethod.POST)
    public String setCreateStreanAndVideo(HttpSession session, @ModelAttribute("createVideoAndStreamDto")CreateStreamAndVideoDto createVideoAndStreamDto) {



        System.out.println("Well done");

        System.out.println("Type :" + createVideoAndStreamDto.getType());

        System.out.println("Titel :" + createVideoAndStreamDto.getTitel());

        System.out.println("Name :" + createVideoAndStreamDto.getName());

        System.out.println("refImage :" + createVideoAndStreamDto.getRefImage());

        System.out.println("refVideo :" + createVideoAndStreamDto.getRefVideo());

        System.out.println("Date :" + createVideoAndStreamDto.getDate());

        System.out.println(sreamsVideoNewsCreatorServiceImlement.setVideoOrStream(createVideoAndStreamDto) + "Good!!!");

        return "createStreamsAndVideo";
    }

    @RequestMapping( value = "/createNews", method = RequestMethod.POST)
    public String setCreateNews(HttpSession session, @ModelAttribute("CreateNewsDto")CreateNewsDto createNewsDto) {

        System.out.println("Well done");



        System.out.println("Titel :" + createNewsDto.getTitel());

        System.out.println("Content :" + createNewsDto.getContent());

        System.out.println("refImage :" + createNewsDto.getRefImage());

        System.out.println("Date :" + createNewsDto.getDate());


        return "createNews";
    }

    @RequestMapping( value = "/deletePost", method = RequestMethod.POST)
    public String setDeletePost(HttpSession session, @ModelAttribute("CreateNewsDto")CreateNewsDto createNewsDto) {

        System.out.println("Well done");



        System.out.println("Titel :" + createNewsDto.getTitel());

        System.out.println("Content :" + createNewsDto.getContent());

        System.out.println("refImage :" + createNewsDto.getRefImage());

        System.out.println("Date :" + createNewsDto.getDate());


        return "createNews";
    }



    }
