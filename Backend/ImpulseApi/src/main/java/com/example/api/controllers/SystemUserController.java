package com.example.api.controllers;

import com.example.api.entities.SystemUser;
import com.example.api.repositories.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class SystemUserController {

    @Autowired
    private SystemUserRepository systemUserRepository;

    @GetMapping
    public List<SystemUser> getAllUsers() {
        return systemUserRepository.findAll();
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }
}
