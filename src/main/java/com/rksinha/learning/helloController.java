package com.rksinha.learning;

import com.rksinha.learning.entity.Todo;
import com.rksinha.learning.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api/book")
public class helloController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping()
    public String hello() {
        return "Hello, Spring Boot! Your application is running successfully.";
    }

    @GetMapping("/list")
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
}
