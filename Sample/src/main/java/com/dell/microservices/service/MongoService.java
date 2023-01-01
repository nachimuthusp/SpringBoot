package com.dell.microservices.service;

import com.dell.microservices.mongodocs.StartupLog;
import com.dell.microservices.repository.StartupLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {
    @Autowired
    StartupLogRepository startupLogRepository;
    @Autowired
    MongoRepository mongoRepository;
    public StartupLog fetchMongoData(String hostName) {
        //StartupLog s = startupLogRepository.findItemByName(hostName);
        int s1 = 1;
        List s = startupLogRepository.findAll();

        return null;
    }
}
