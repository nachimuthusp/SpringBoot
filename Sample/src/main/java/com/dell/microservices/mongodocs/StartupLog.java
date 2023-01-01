package com.dell.microservices.mongodocs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Stock")
@Data
@AllArgsConstructor
public class StartupLog {
    @Id
    private String id;
    private int stockid;
    private String stockname;
}
