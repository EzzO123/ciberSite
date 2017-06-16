package by.usovich.controllers;


import by.usovich.dto.PostJson;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import by.usovich.service.PostServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by yanus on 15.05.2017.
 */


@Controller
public class PostController {

    //private final Logger;

    @Autowired
    public PostServiceInterface postServiceImp;



    @RequestMapping(value = "/getNews",method = RequestMethod.POST)
    public String getNews(){

        //Session

        return null;
    }
   // @RequestParam("photo") MultipartFile photo

   // @ModelAttribute("newPost") PostJson postJson,
   @RequestMapping(value = "/",method = RequestMethod.GET)
    public String emptyUrl( HttpSession session,Model model) {


       System.out.println("1) : Controller");
        model.addAttribute("onePost",postServiceImp.getPostAtNameGame("dota"));
       System.out.println("6) : Controller(return)");
      //  model.addAttribute("newPost", jsonArray);
        //Session

        return "index";
    }


}
