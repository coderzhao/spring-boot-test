package com.maxj.controller;

import com.maxj.entity.SocketMessage;
import com.maxj.entity.SocketMessageResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@Controller
public class WebSocketController {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @MessageMapping("/ws/hello")
    @SendTo("/topic/hello-response")
    public SocketMessageResponse hello(SocketMessage socketMessage) throws Exception {
        Thread.sleep(1000);
        return new SocketMessageResponse("Hello! How do you do? " + dateFormat.format(new Date()));
    }
}
