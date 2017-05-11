package by.usovich.controllers;

import by.usovich.dto.UserDTO;
import by.usovich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 10.05.2017.
 *  This is LoginController
 */
@Controller
public class LoginController {

    //@Autowired private LoginValidator loginValidator;//TODO
    @Autowired
    private UserService userService;//TODO

    //@Autowired private
    @RequestMapping(value = "/login",method = RequestMethod.POST)//TODO
    public String logginProcess(Model model,
                                HttpSession session, @ModelAttribute("userDTO") UserDTO userDTO){


    return "/WEB-INF/pages/index.jsp";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String empty(Model model) {
       // model.addAttribute("userDTO", new UserDTO());
        userService.getUserByLogin("YanSoLo");
        return "/WEB-INF/pages/index.jsp";
    }

    @RequestMapping(value = "/exit", method = RequestMethod.POST)
    public String exit(HttpSession session, Model model) {
        session.invalidate();
        //model.addAttribute("userDTO", new UserDTO());
        return "/WEB-INF/pages/index.jsp";
    }

}
