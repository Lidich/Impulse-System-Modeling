package com.example.api.repositories;

import com.example.api.entities.SystemUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface SystemUserRepository extends MongoRepository<SystemUser, UUID> {
}
