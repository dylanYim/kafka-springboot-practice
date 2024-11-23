package com.dk.kafka_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
