package com.pard.seminar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiRestController {
    @RequestMapping("/hi")
    public String hi() {
        return "hello.html";
    }
}
