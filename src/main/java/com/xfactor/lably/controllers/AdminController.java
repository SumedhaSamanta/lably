package com.xfactor.lably.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.lably.entities.Admin;

@RestController
@RequestMapping("/adminControl")
public class AdminController
{
    ArrayList<Admin> admins = new ArrayList<>();

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin) {
        admins.add(admin);
        return admin;
    }
    @GetMapping("/getAdmins")
    public ArrayList<Admin> getAdmins()
    {
        for(int i = 1;i<=5;i++)
        {
            Admin admin = new Admin();
            admin.setName("AdminName");
            admin.setUsername("UserName");
            admin.setPassword("password");
            admins.add(admin);
        }
        return admins;
    }
    @GetMapping("/getAdmins/{name}")
    public Admin getAdmins(@PathVariable String name) {
        Admin admin = new Admin();
        for (Admin a1 : admins) {
            if (a1.getName().equals(name))
            {
                return a1;
            }

        }
        return admin;
    }    
}
