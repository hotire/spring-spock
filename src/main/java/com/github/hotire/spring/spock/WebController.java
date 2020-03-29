package com.github.hotire.spring.spock;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class WebController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("Hello world!");
    }
}
