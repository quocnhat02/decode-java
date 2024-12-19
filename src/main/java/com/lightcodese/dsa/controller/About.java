package com.lightcodese.dsa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class About {
    @GetMapping("/about")
    public String about() {
        return "Hello World";
    }
}
