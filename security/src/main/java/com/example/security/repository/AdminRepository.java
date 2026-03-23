package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
