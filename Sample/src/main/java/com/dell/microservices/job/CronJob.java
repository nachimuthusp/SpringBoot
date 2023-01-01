package com.dell.microservices.job;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class CronJob {
    //@Scheduled(cron = "0/1 * * * * *")
    public void testJob(){
         System.out.println("Hi this is warren munger!");
    }
}
