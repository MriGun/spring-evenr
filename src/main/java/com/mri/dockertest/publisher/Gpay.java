package com.mri.dockertest.publisher;

import com.mri.dockertest.events.TransactionFailureEvent;
import org.springframework.context.ApplicationEventPublisher;

public class Gpay {

    private ApplicationEventPublisher eventPublisher;

    public void sendMoney(String name, double amount) {

        try {
            if (1 ==1) {
                throw new RuntimeException("Transaction failed..");
            }

            System.out.println("Hi " + name);
            System.out.println("Sending amount " +amount+ " is successful");
        }
        catch (Exception e) {
            eventPublisher.publishEvent(new TransactionFailureEvent(name, amount));
            e.printStackTrace();

        }

    }

}
