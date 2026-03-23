package com.example.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false)
    private String username;


    public Member() {

    }
    public Member(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public void setName(String name) {this.name = name;}
    public void setUsername(String username) {this.username = username;}

    public String getName() {return this.name;}
    public String getUsername() {return this.username;}

}
