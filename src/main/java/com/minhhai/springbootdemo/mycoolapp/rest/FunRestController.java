package com.minhhai.springbootdemo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String showTime(){
        return "Hello World from Spring Boot. The current time is " + LocalDateTime.now();
    }
}
