package com.maxj.controller;

import com.maxj.entity.User;
import com.maxj.service.impl.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Map<String, Object> model, String name) {
        User user = userService.findUser(name);
        if (user != null) {
            model.put("user", user);
        }
        return "word";
    }

}
