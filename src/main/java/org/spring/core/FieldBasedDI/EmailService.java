package org.spring.core.FieldBasedDI;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : " + message);
    }
}
