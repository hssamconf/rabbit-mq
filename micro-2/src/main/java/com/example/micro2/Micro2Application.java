package com.example.micro2;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Micro2Application {

    public static void main(String[] args) {
        SpringApplication.run(Micro2Application.class, args);
    }

    @Bean
    public Queue myQueue() {
        return new Queue("auth.register", false);
    }

    @RabbitListener(queues = "auth.register")
    public void listen(String in) {
        System.out.println("Message read from myQueue : " + in);
    }

}
