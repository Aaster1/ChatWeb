package com.aster.chat.aster.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.aster.chat.aster.dto.Msg;

@CrossOrigin(origins = "*")
@RestController
public class ChatController {
    
    @MessageMapping("/chat/msgList")
    @SendTo("/topic/msg")
    public List<Msg> msgHangler(Msg msg){

        Msg msg1 = new Msg();
        msg1.setNickname("nick1");
        msg1.setMsg("msg1");
        Msg msg2 = new Msg();
        msg2.setNickname("nick3");
        msg2.setMsg("msg3");
        Msg msg3= new Msg();
        msg3.setNickname("nick3");
        msg3.setMsg("msg3");
        List<Msg> msgList = new ArrayList<>();
        msgList.add(msg1);
        msgList.add(msg2);
        msgList.add(msg3);

        return msgList;
    }

}
