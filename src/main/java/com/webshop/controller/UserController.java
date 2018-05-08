package com.webshop.controller;

import com.webshop.model.User;
import com.webshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/registration")
    public String home(Model model) {

         model.addAttribute("user",new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, HttpServletRequest request){

        if(bindingResult.hasErrors()){
            return "registration";
        }else{

            userService.save(user);
            request.setAttribute("good", "GOOD");
            return "redirect:/";
        }
    }
}
