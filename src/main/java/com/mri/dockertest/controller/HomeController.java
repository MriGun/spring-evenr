package com.mri.dockertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Home is running";
    }

    @GetMapping("/message")
    public String showMessege() {
        return "Congratulations! You have successfully deployed application to kubernetes!";
    }
}
