package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@Controller
public class NormalController {

    @RequestMapping(value = "/indexPage", method = RequestMethod.GET)
    public String index() {
        return "test";
    }
}
