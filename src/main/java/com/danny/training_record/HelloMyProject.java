package com.danny.training_record;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMyProject {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to training record.";
    }
}