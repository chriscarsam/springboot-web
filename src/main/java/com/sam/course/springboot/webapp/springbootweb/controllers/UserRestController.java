package com.sam.course.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

     @GetMapping("/details2")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world Spring Boot");
        body.put("name", "Charly");
        body.put("lastname", "Test");
        return body;
    }
}