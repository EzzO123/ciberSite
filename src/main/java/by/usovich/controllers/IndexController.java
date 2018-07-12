package by.usovich.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 8/7/2017.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndexPage(HttpSession session){

        return "index";
    }
}
