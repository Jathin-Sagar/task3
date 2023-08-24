package com.example.demo; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hi")
    public String hello() {
        return "Welcome to springapp!";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String welcome() {
        return "Hi to springapp!";
    }
}

