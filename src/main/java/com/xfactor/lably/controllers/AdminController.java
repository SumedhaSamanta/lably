package com.xfactor.lably.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.xfactor.lably.entities.Admin;
import com.xfactor.lably.repository.AdminRepository;

@RestController
@RequestMapping("/adminControl")
public class AdminController
{
    @Autowired
    AdminRepository adminRepository;
    @PostMapping("/registerAdmin")
    public Admin addAdmin(@RequestBody Admin admin) {
        Admin persistedAdmin = adminRepository.save(admin);
        return persistedAdmin;
    }
    @GetMapping("/getAllAdmins")
    public List<Admin> getAdmins()
    {
        List<Admin> persistedAdmins = adminRepository.findAll();
        return persistedAdmins;
    }
    @GetMapping("/getAdminByUsername")
    public Admin getAdminByUsername(@RequestParam String username) {
        Admin admin = adminRepository.findByUsername(username);
        return admin;
    }    
    @GetMapping("/deleteAdminById")
    public void deleteAdminById(@RequestParam Long id)
    {
        adminRepository.deleteById(id);
    }
    @GetMapping("/deleteAdminByUsername")
    public void deleteAdminByUsername(@RequestParam String username)
    {
        Admin admin = adminRepository.findByUsername(username);
        adminRepository.delete(admin);
    }
}
