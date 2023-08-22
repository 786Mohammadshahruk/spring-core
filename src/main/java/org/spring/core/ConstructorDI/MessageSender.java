package org.spring.core.ConstructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private MessageService messageService;

    @Autowired
    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("initialized MessageService ");
    }

    public void sendMessage(String message) {
        System.out.println("Inside sendMessage()");
        messageService.sendMessage(message);
    }


}
