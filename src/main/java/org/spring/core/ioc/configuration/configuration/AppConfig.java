package org.spring.core.ioc.configuration.configuration;

import org.spring.core.ioc.configuration.CODPaymentProcessor;
import org.spring.core.ioc.configuration.CreditCardPaymentProcessor;
import org.spring.core.ioc.configuration.DebitCardPaymentProcessor;
import org.spring.core.ioc.configuration.PaymentProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public CODPaymentProcessor getCodPaymentProcessor() {
        CODPaymentProcessor codPaymentProcessor = new CODPaymentProcessor();
        codPaymentProcessor.setName("Annotation Based Configuration");
        return codPaymentProcessor;
    }

    @Bean
    public CreditCardPaymentProcessor getCreditCardPaymentProcessor() {
        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        return creditCardPaymentProcessor;
    }

    @Bean
    //@Qualifier("debit_card_1")
    public DebitCardPaymentProcessor getDebitCardPaymentProcessor() {
        DebitCardPaymentProcessor debitCardPaymentProcessor = new DebitCardPaymentProcessor();
        return debitCardPaymentProcessor;
    }

    /*@Bean
    @Qualifier("debit_card_2")
    public DebitCardPaymentProcessor debitCardPaymentProcessor() {
        DebitCardPaymentProcessor debitCardPaymentProcessor = new DebitCardPaymentProcessor();
        return debitCardPaymentProcessor;
    }*/




}
