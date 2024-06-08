package com.example.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "Users")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SystemUser {

    @Id
    @Field("_id")
    private UUID id = UUID.randomUUID(); // Автоматическая генерация UUID

    private String login;
    private String password;

    private LocalDateTime dateCreated;

    public SystemUser() {}

    public SystemUser(String login, String password){
        this.login = login;
        this.password = password;
        this.dateCreated = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser systemUser = (SystemUser) o;
        return
                Objects.equals(login, systemUser.login) &&
                Objects.equals(password, systemUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, dateCreated);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }
}
