package com.example.micro1;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Micro1Application {

    public static void main(String[] args) {
        SpringApplication.run(Micro1Application.class, args);
    }

    @Bean
    public Queue myQueue() {
        return new Queue("auth.register", false);
    }
}
