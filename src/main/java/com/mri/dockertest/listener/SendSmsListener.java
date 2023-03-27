package com.mri.dockertest.listener;

import com.mri.dockertest.events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SendSmsListener {
    @EventListener
    public void start(TransactionFailureEvent event) {
        System.out.println("Sendinf email");
        System.out.println("Sending email with body,Hi " + event.getName() + "Transaction failed for amount " + event.getAmount());
    }
}
