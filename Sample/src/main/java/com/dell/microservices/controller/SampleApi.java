package com.dell.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/get")
public class SampleApi {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/article/{articleId}")
    public String getValue(@PathVariable("articleId") String articleId){
        return restTemplate.getForObject("https://api.zalando.com/article-reviews/"+articleId,String.class);
    }
}
