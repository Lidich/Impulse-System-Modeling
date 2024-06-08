
package com.example.api.config;

import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.api.repositories")
public class MongoConfig {


    /*
    @Bean
    public MongoTemplate mongoTemplate()
            throws UnknownHostException, java.net.UnknownHostException {
        return new MongoTemplate(
                new SimpleMongoDbFactory(
                        mongoClient(),
                        getDatabaseName()
                )
        );
    }


    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(MongoClients.create("mongodb+srv://Lidich:<qxCPxWlDVLm0a5Vb>@slnkcluster.fxj7ui8.mongodb.net/?retryWrites=true&w=majority&appName=SLNKcluster"), "ImpulseDB");
    }*/
}

