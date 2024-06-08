package com.example.api.controllers;

import com.example.api.entities.SystemUser;
import com.example.api.repositories.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Example;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    SystemUserRepository systemUserRepository;

    @GetMapping(path = "/login")
    public Optional<SystemUser> login(@RequestParam String login, @RequestParam String password){
        SystemUser systemUser = new SystemUser(login, password);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("id", "dateCreated");
        Example<SystemUser> example = Example.of(systemUser, matcher);
        return (systemUserRepository.findOne(example));
    }

    @PostMapping(path = "/register")
    public Optional<SystemUser> register(@RequestParam String login, @RequestParam String password){
        SystemUser systemUser = new SystemUser(login, password);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("id", "password", "dateCreated");
        Example<SystemUser> example = Example.of(systemUser, matcher);
        Optional<SystemUser> systemUserFound =systemUserRepository.findOne(example);

        if(systemUserFound.isEmpty()) {
            systemUserRepository.save(systemUser);
            return Optional.ofNullable((systemUser));
        }
        else return Optional.empty();
    }
}
