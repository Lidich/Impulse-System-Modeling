package com.example.api.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("")
public class ViewController {
    @GetMapping(path = "/hello")
    public String hello() {
        return "createPage.html";
    }
}
