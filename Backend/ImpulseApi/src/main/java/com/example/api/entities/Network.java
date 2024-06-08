package com.example.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document(collection = "Networks")
public class Network {
    @Id
    @Field("_id")
    private UUID id = UUID.randomUUID(); // Автоматическая генерация UUID

    private String name;
    private UUID userId;
    private String networkJson;

    // Конструкторы
    public Network() {}

    public Network(String name, UUID userId, String networkJson) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.userId = userId;
        this.networkJson = networkJson;
    }

    // Getters и Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getNetworkJson() {
        return networkJson;
    }

    public void setNetworkJson(String networkJson) {
        this.networkJson = networkJson;
    }

    @Override
    public String toString() {
        return "Network{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", networkJson='" + networkJson + '\'' +
                '}';
    }
}
