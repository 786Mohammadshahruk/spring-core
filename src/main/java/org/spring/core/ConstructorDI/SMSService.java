package org.spring.core.ConstructorDI;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS : " + message);
    }
}
