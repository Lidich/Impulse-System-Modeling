package com.example.webNotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final SystemUserRepository repository;

    @Autowired
    public DatabaseLoader(SystemUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        //this.repository.save(new NoteUser("Frodo", "bimbo_toilet"));
    }
}
