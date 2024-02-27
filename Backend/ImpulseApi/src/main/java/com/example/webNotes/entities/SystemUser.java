package com.example.webNotes.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "systemusers")
public class SystemUser {
    private @Id
    @SequenceGenerator(name = "systemusersIdSeq", sequenceName = "systemusers_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "systemusersIdSeq") Long id;
    private String login;
    private String password;

    public SystemUser() {}

    public SystemUser(String password, String login){
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser systemUser = (SystemUser) o;
        return Objects.equals(id, systemUser.id) &&
                Objects.equals(login, systemUser.login) &&
                Objects.equals(password, systemUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
