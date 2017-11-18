package com.maxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

    @RequestMapping(value = {"", "/"})
    public String index() {
        return "index";
    }
}
