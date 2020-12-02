package com.example.football.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
        @RequestMapping(value = "/api/v1")
public class FirstController {
    @GetMapping("/hello")
    public String greeting(){
        return "Привіт!";
    }
    @GetMapping("/bue")
    public String bue(){
        return "До побачення!";
    }
}
