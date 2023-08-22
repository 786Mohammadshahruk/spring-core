package org.spring.core.setterBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Setter based DI");
    }

    public void sendMessage(String message) {
        System.out.println("Inside sendMessage()");
        messageService.sendMessage(message);
    }


}
