package by.usovich.controllers;


import by.usovich.service.PostServiceInterface;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 15.05.2017.
 */


@Controller
public class PostController {

    //private final Logger;

    @Autowired
    public PostServiceInterface postServiceImp;




    @RequestMapping(value = "/getNews",method = RequestMethod.POST)
    public String getNews(@RequestParam String titel,@RequestParam String number, HttpSession session, Model model){

        model.addAttribute("posts",postServiceImp.getPostAtNameGame(titel,number).getMap());

        return "index";
    }

   @RequestMapping(value = "/",method = RequestMethod.GET)
    public String emptyUrl(HttpSession session, Model model) {


        return "index";
    }


}
