package com.project.Aerial;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration{

    @Override
    protected String getDatabaseName() {
        return "Aerial-api-db";
    }

    protected String getMappingBasePackage() {
        return "com.project.Aerial";
    }

    protected String getConnectionString() {
        return "mongodb://localhost:27017/";
    }
    
    @Bean
	public MongoClient mongoClient() {
        return MongoClients.create(getConnectionString());
    }

    @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoClient(), "Aerial-api-db");
    }
}