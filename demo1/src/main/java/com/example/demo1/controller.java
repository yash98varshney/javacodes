package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @GetMapping("/hello/")
    public String test(){
        return "hello";
    }
}
