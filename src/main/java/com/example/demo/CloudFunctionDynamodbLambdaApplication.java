package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
// import org.springframework.nativex.hint.NativeHint;
// import org.springframework.nativex.hint.SerializationHint;

import software.amazon.awssdk.core.Response;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

// @NativeHint
// @SerializationHint(types = {Request.class, Response.class, Session.class})
@SpringBootApplication
public class CloudFunctionDynamodbLambdaApplication {
    Region awsRegion = Region.EU_WEST_1;

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionDynamodbLambdaApplication.class, args);
    }

    @Bean
    public DynamoDbClient dynamoDbClient() {
        return DynamoDbClient.builder().region(awsRegion).build();
    }

    @Bean
    public String tableName(){
        return "sessions";
    }
}