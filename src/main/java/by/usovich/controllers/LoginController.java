package by.usovich.controllers;

import by.usovich.dto.LoginAndRegDto.LoginDto;
import by.usovich.service.UserServiseInterface;
import by.usovich.validators.LoginValidator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 7/11/2017.
 */

@Controller
public class LoginController {

    //ToDo
    public LoginValidator validator = new LoginValidator();

    private static final Logger log = Logger.getLogger(LoginController.class);

    @Autowired
    public UserServiseInterface userServiseImp;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Login(@ModelAttribute("userDto") LoginDto userDto, HttpSession session){


        System.out.println("\n" + userDto.getEmail() + "   " + userDto.getNick() + "   " + userDto.getPassword() + "   ");

        if(userServiseImp.isLoginExists(userDto.getNick() +"") == true){
            log.info("Login is here! : " + userDto.getNick());
        }



        return "login";
    }

}
