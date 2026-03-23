package com.example.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "name", nullable = false)
    private String name;


    public Admin() { }
    public Admin(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public void setUsername(String username) {this.username = username;}
    public void setName(String name) {this.name = name;}

    public String getUsername() {return this.username;}
    public String getName() {return this.name;}
}
