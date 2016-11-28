package com.chechel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

import static com.chechel.spring.UrlMapping.ACCESS_DENIED;
import static com.chechel.spring.UrlMapping.ADMIN;
import static com.chechel.spring.UrlMapping.LOGIN;
import static com.chechel.spring.UrlMapping.LOGOUT;
import static com.chechel.spring.UrlMapping.USER;

@Controller
public class LogInOutAndSesure {

    @RequestMapping(LOGIN)
    public String login() {
        return "login";
    }

//    @RequestMapping(LOGOUT)
//    public void logout(Model model,Principal principal) {
//        model.asMap().put("user", principal.getName());
//    }

    @RequestMapping(ADMIN)
    @ResponseBody
    public String secureForAdmin() {
        return "secureForAdmin OK";
    }

    @RequestMapping(USER)
    @ResponseBody
    public String secureForUser() {
        return "secureForUser OK";
    }

    @RequestMapping(ACCESS_DENIED)
    public ModelAndView accessDenied(Principal principal) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("accessDenied");
        modelAndView.getModel().put("user",principal.getName() );
        return modelAndView;
    }
}
