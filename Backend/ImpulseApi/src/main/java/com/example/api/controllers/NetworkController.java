package com.example.api.controllers;


import com.example.api.repositories.NetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/networks")
public class NetworkController {
    @Autowired
    private NetworkRepository networkRepository;
}
