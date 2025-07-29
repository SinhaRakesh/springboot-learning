package com.rksinha.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/book")
public class helloController {
//    @Autowired


    @GetMapping()
    public String hello() {
        return "Hello, Spring Boot! Your application is running successfully.";
    }
}
