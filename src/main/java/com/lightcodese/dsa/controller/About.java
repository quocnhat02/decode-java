package com.lightcodese.dsa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class About {
    @Value("${player.name}")
    private String PlayerName;
    @Value("${player.age}")
    private int PlayerAge;

    @GetMapping("/about")
    public String about() {
        return PlayerName + " " + PlayerAge;
    }
}
