package com.maxj.controller;

import com.maxj.entity.User;
import com.maxj.service.impl.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello-data")
    public List<Map<String, Object>> hello(Map<String, Object> model, String name) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        User user = userService.findUser(name);
        if (user != null) {
            model.put("user", user);
        }
        return result;
    }

}
