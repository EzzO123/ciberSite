package by.usovich.controllers;

import by.usovich.dto.UserDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by yanus on 10.05.2017.
 */
public class RegController {

    @RequestMapping(value = "/reg",method = RequestMethod.POST)//TODO
    public String RegProcess(Model model,
                                HttpSession session, @ModelAttribute("userDTO") UserDTO userDTO){


        return "/index";

    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String empty(Model model) {
//        // model.addAttribute("userDTO", new UserDTO());
//        return "/index";
//    }
}
