package com.chechel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.chechel.spring.UrlMapping.BYE;
import static com.chechel.spring.UrlMapping.HELLO;
import static com.chechel.spring.UrlMapping.INDEX;
import static com.chechel.spring.UrlMapping.LOGIN;

@Controller
public class HelloController {
    @RequestMapping(value = HELLO)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = INDEX)
    public String index() {
        return "index";
    }
}
