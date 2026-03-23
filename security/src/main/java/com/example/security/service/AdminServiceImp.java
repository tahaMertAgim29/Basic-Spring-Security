package com.example.security.service;

import org.springframework.stereotype.Service;

import com.example.security.entity.Admin;
import com.example.security.exception.AdminNotFoundException;
import com.example.security.repository.AdminRepository;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    private final AdminRepository repository;

    public AdminServiceImp(AdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Admin> getAllAdmins() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        // TODO Auto-generated method stub
       return repository.save(admin);
    }

    @Override
    public Admin getAdminbyId(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id).orElseThrow(() -> new AdminNotFoundException(id));
    }

    @Override
    public void deleteAdmin(Long id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }


    
}
