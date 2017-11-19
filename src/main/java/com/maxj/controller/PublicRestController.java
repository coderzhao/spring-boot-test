package com.maxj.controller;

import com.maxj.CommResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicRestController {

    @RequestMapping("/getHelloWorlds")
    public CommResponse getHelloWorlds() {
        return CommResponse.OK("hello, spring-boot + jquery + vue !");
    }

    @RequestMapping("/loadTestData")
    public CommResponse loadTestData() {
        List<String> datas = new ArrayList<String>();
        datas.add("abc");
        datas.add("cde");
        datas.add("efg");
        return CommResponse.OK("aaa", datas);
    }
}
