package com.example.security.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.entity.Admin;
import com.example.security.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping("/admins")
    public List<Admin> displayAdmins() {
        return this.service.getAllAdmins();
    }

    @GetMapping("/admin/{id}")
    public Admin getAdminbyId(@PathVariable Long id) {
        return this.service.getAdminbyId(id);
    }

    @PostMapping("/admin/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin saveAdmin(@RequestBody Admin admin) {
        return this.service.saveAdmin(admin);
    }


    @DeleteMapping("/admin/del/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        this.service.deleteAdmin(id);
    }
}   
