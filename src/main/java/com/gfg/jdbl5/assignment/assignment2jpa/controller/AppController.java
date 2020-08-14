package com.gfg.jdbl5.assignment.assignment2jpa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${app.title}")
    private String appTitle;

    @Value("${app.description}")
    private String appDiscription;


    @GetMapping("/port")
    public String getPort(){
        return serverPort;
    }

    @GetMapping("/title")
    public String getApplicationTitle(){
        return appTitle;
    }

    @GetMapping("description")
    public String getApplicationDescription(){
        return appDiscription;
    }

}
