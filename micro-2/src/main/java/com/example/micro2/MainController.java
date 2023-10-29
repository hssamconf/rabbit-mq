package com.example.micro2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping("/info")
    public ResponseEntity<Object> test() {
        log.info("Hello from micro 2");
        return ResponseEntity.ok().build();
    }
}
