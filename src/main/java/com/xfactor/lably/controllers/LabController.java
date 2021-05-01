package com.xfactor.lably.controllers;

import java.util.ArrayList;

import com.xfactor.lably.entity.Lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labcontrol")
public class LabController 
{
    ArrayList<Lab> labs = new ArrayList<>();

    @PostMapping("/addLab")
    public Lab addLab(@RequestBody Lab lab) {
        labs.add(lab);
        return lab;
    }
    @GetMapping("/getLabs")
    public ArrayList<Lab> getLabs()
    {
        for(int i = 1;i<=5;i++)
        {
            Lab lab = new Lab();
            lab.setAddress("A");
            lab.setName("LabName");
            lab.setPhone("phone");
            lab.setPincode("pincode");
            labs.add(lab);
        }
        return labs;
    }
    @GetMapping("/getLabs/{name}")
    public Lab getLabs(@PathVariable String name) {
        Lab lab = new Lab();
        for (Lab lab1 : labs) {
            if (lab1.getName().equals(name))
            {
                return lab1;
            }

        }
        return lab;
    }

}
