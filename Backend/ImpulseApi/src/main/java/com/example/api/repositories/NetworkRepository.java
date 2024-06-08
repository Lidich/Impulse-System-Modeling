package com.example.api.repositories;

import com.example.api.entities.Network;
import com.example.api.entities.SystemUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface NetworkRepository extends MongoRepository<Network, UUID> {
    List<Network> findByUserId(UUID userId);
}
