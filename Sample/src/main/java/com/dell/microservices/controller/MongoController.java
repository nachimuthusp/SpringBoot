package com.dell.microservices.controller;

import com.dell.microservices.mongodocs.StartupLog;
import com.dell.microservices.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MongoController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    MongoService mongoService;
    @GetMapping("/mongoquery/{hostname}")
    public StartupLog getValue(@PathVariable("hostname") String hostName) {
        return mongoService.fetchMongoData(hostName);
    }
}
