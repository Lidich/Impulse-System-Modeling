package com.example.webNotes;

import com.example.webNotes.entities.SystemUser;
import org.springframework.data.repository.CrudRepository;

public interface SystemUserRepository extends CrudRepository<SystemUser, Long> {
}
