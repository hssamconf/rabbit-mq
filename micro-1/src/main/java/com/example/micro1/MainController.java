package com.example.micro1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    private final RabbitTemplate rabbitTemplate;


    public MainController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/info")
    public ResponseEntity<Object> test() {
        log.info("Hello from micro 1");
        rabbitTemplate.convertAndSend("auth.register", "user just registered");
        return ResponseEntity.ok().build();
    }
}
