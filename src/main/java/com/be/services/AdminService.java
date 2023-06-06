package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.Admin;
import com.be.repositories.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public ResponseEntity<Admin> findAdminById(String id) {
        try {
            Admin admin = adminRepository.findById(id).orElseThrow(() -> new Error("Admin not found."));
            return new ResponseEntity<Admin>(admin, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
    }
}
