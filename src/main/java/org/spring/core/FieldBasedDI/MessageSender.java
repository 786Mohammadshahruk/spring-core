package org.spring.core.FieldBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    @Qualifier("smsService")
    private MessageService messageService;


    public void sendMessage(String message) {
        System.out.println("Inside sendMessage()");
        messageService.sendMessage(message);
    }


}
