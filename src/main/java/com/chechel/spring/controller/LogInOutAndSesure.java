package com.chechel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.chechel.spring.UrlMapping.ADMIN;
import static com.chechel.spring.UrlMapping.LOGIN;
import static com.chechel.spring.UrlMapping.LOGOUT;
import static com.chechel.spring.UrlMapping.USER;

@Controller
public class LogInOutAndSesure {

    @RequestMapping(LOGIN)
    @ResponseBody
    public String login() {
        return "login";
    }

    @RequestMapping(ADMIN)
    @ResponseBody
    public String secureForAdmin() {
        return "secureForAdmin OK";
    }

    @RequestMapping(LOGOUT)
    @ResponseBody
    public String logout() {
        return "logout OK";
    }

    @RequestMapping(USER)
    @ResponseBody
    public String secureForUser() {
        return "secureForUser OK";
    }
}
