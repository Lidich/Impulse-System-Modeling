package com.example.webNotes.controllers;

import com.example.webNotes.SystemUserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final SystemUserRepository repository;

    AuthController(SystemUserRepository repository){
        this.repository = repository;
    }
}
