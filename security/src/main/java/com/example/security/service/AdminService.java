package com.example.security.service;

import java.util.List;
import com.example.security.entity.Admin;

public interface AdminService {

    List<Admin> getAllAdmins();

    Admin saveAdmin(Admin admin);

    Admin getAdminbyId(Long id);

    void deleteAdmin(Long id);
}
