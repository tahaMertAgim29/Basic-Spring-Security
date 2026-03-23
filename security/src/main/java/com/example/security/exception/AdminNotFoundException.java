package com.example.security.exception;

public class AdminNotFoundException extends RuntimeException {

    public AdminNotFoundException(Long id) {
        super("Admin not found with Id: " + id);
    }
}
