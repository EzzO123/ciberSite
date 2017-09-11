package by.usovich.controllers;

import by.usovich.service.CommonChatServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 9/6/2017.
 */
@Controller
public class CommonChatController {

    @Autowired
    public CommonChatServiceInterface commonChatServiceImplement;


    @RequestMapping(value = "/getMessage",method = RequestMethod.POST,produces = "application/json")
    public @ResponseBody  String getNewsPostTesting(HttpSession session){

       /// String string = postServiceImp.getNewsAtNameGame(theme,newsDeriction,newsPerPage,session).getJsonArray().toString();//for debbug

        return null;
    }


}
