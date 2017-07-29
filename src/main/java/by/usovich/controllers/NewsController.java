package by.usovich.controllers;


import by.usovich.dto.NewsDto.NewsDto;
import by.usovich.service.NewsServiceInterface;
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
public class NewsController {

    //private final Logger;

    @Autowired
    public NewsServiceInterface postServiceImp;


    private static final Logger log = Logger.getLogger(NewsController.class);

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String getNewPageWithNews(@RequestParam String titel,@RequestParam String number, HttpSession session, Model model){


        model.addAttribute("posts",postServiceImp.getPostAtNameGame(titel,number).getMap());

        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getNewPage( HttpSession session, Model model){


        return "index";
    }


    @RequestMapping(value = "/getNews",method = RequestMethod.GET)
    public @ResponseBody
   // Map<String,PostJsonDto> getNews(@RequestParam("titel") String titel, @RequestParam("number") String number, HttpSession session, Model model){
    String getNews(@RequestParam() String titel, @RequestParam() String number, HttpSession session, Model model){

        Map<String,NewsDto> response = null;

        return postServiceImp.getPostAtNameGame(titel,number).getJsonArray().toString();
    }





}
