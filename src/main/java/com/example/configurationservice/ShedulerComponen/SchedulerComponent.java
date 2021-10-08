package com.example.configurationservice.ShedulerComponen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerComponent {


    @Value("${message:Welcome to Kubernetes}")
    private String message;

    @Scheduled(fixedDelay = 3000)
    public void display()
    {
        System.out.println("Hello : "+ message);
    }
}
