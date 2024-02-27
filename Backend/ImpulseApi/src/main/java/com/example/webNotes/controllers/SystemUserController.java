package com.example.webNotes.controllers;

import com.example.webNotes.SystemUserRepository;
import com.example.webNotes.entities.SystemUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SystemUserController {

    private final SystemUserRepository repository;

    SystemUserController(SystemUserRepository repository){
        this.repository = repository;
    }

    @GetMapping("/users")
    List<SystemUser> all(){
        return (List<SystemUser>) repository.findAll();
    }

    @GetMapping("/users/{id}")
    SystemUser one(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @PostMapping("/users")
    SystemUser newNoteUser(@RequestBody SystemUser newSystemUser){
        return repository.save(newSystemUser);
    }
}
