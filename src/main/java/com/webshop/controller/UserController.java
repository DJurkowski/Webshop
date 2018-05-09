package com.webshop.controller;

import com.webshop.model.Status;
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
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/registration")
    public String home(Model model) {

        model.addAttribute("user", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, HttpServletRequest request) {

        if (bindingResult.hasErrors()) {
            return "registration";
        } else {
            if (userService.nickIsValid(user.getNick())) {
                if (userService.mailIsValid(user.getEmail())) {
                    if (user.getPassword().equals(user.getRe_password()) && user.getPassword() != null) {
                        user.setStatus(Status.CUSTOMER);
                        userService.save(user);
                        request.setAttribute("good", "GOOD");
                        return "index";
                    } else {
                        request.setAttribute("pass", "NOPASS");
                        return "registration";
                    }
                } else {
                    request.setAttribute("mail", "WRONG");
                    return "registration";
                }

            } else {
                request.setAttribute("nick", "WRONG");
                return "registration";
            }
        }
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String checkUser(@ModelAttribute @Valid User user, BindingResult bindingResult, HttpServletRequest request) {

        HttpSession session = request.getSession(true);

        if (!userService.nickIsValid(user.getNick())) {
            User sessionUser = userService.findUser(user.getNick());

            if (userService.passwordIsValid(sessionUser, user.getPassword())) {
                //creating user session
                session.setAttribute("user", sessionUser);
                request.setAttribute("nickname", sessionUser);
                return "indexCustomer";
            } else {
                request.setAttribute("pass", "WRONG");
                return "login";
            }

        } else {
            request.setAttribute("nick", "WRONG");
            return "login";
        }

    }

    @GetMapping("/user-home")
    public String user_home(HttpServletRequest request, HttpSession session, Model model){

        User sessionUser = (User) session.getAttribute("user");
//        model.addAttribute("user", sessionUser);

        if(sessionUser !=null){
            request.setAttribute("nickname", sessionUser);
            return "indexCustomer";
        }else{
            model.addAttribute("user", new User());
            request.setAttribute("register","BAD");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session, HttpServletRequest request){
        session.invalidate();
        request.setAttribute("logout","GOOD");
        return "index";
    }
}
