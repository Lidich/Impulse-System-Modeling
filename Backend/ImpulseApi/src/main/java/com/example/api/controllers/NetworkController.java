package com.example.api.controllers;


import com.example.api.entities.Network;
import com.example.api.repositories.NetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/networks")
public class NetworkController {
    @Autowired
    private NetworkRepository networkRepository;

    @GetMapping(path = "/allByUser")
    public List<Network> allByUserId(@RequestParam UUID userId){
        return (networkRepository.findByUserId(userId));
    }
}
