package com.flying.university.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


}
