package com.example.websocket.messagingSocket;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/connect")
    @SendTo("/topic/greeting")
    public Response message(Message msg)throws Exception{
        Thread.sleep(500);
        return new Response(HtmlUtils.htmlEscape(msg.getName())+",Welcome to Websocket!");
    }
}
