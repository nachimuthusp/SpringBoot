package com.dell.microservices.repository;

import com.dell.microservices.mongodocs.StartupLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface StartupLogRepository extends MongoRepository<StartupLog, String> {
  //@Query("{hostname:'?0'}")
  //StartupLog findItemByName(String hostName);
}
