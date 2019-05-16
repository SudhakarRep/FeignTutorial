package com.examples.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.feign.model.TodoModel;
import com.examples.feign.service.TodoClient;

@RestController
@RequestMapping("/todos")
public class TodoController {
    
    @Autowired
    TodoClient todoClient;
    
    @GetMapping()
    public List<TodoModel> getTodos()
    {
        return todoClient.getTodos();
    }
    
}
