package com.mongodbFts.MongoDbFTS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class MongoDbFtsApplication {



	public MongoTemplate mongoTemplates;
	public static void main(String[] args) {
		SpringApplication.run(MongoDbFtsApplication.class, args);
		
	}

}
