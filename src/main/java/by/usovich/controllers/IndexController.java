package by.usovich.controllers;

import by.usovich.service.StreamServiceInterface;
import by.usovich.service.VideoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "main-page-wot",method = RequestMethod.GET)
    public String getMainPageWot(HttpSession session,Model model){

        String number = "3";

        String titel = "wot";



        model.addAttribute("Video",   videoServiceImp.getVideoAtNameGame(titel,number).getMap());
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
}
