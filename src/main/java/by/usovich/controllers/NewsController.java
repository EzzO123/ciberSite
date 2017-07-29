package by.usovich.controllers;


import by.usovich.dto.PostDto;
import by.usovich.service.PostServiceInterface;
import java.util.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 15.05.2017.
 */


@Controller
public class PostController {

    //private final Logger;

    @Autowired
    public PostServiceInterface postServiceImp;


    private static final Logger log = Logger.getLogger(PostController.class);

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String getNewPageWithNews(@RequestParam String titel,@RequestParam String number, HttpSession session, Model model){


        model.addAttribute("posts",postServiceImp.getPostAtNameGame(titel,number).getMap());

        return "index";
    }


    @RequestMapping(value = "/getNews",method = RequestMethod.GET)
    public @ResponseBody
   // Map<String,PostJsonDto> getNews(@RequestParam("titel") String titel, @RequestParam("number") String number, HttpSession session, Model model){
    String getNews(@RequestParam() String titel, @RequestParam() String number, HttpSession session, Model model){

        Map<String,PostDto> response = null;

        return postServiceImp.getPostAtNameGame(titel,number).getJsonArray().toString();
    }





}
