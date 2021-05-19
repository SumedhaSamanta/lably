package com.xfactor.lably.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.xfactor.lably.entities.Lab;
import com.xfactor.lably.repository.LabRepository;

@RestController
@RequestMapping("/labControl")
public class LabController
{
    @Autowired
    LabRepository labRepository;
    @PostMapping("/registerLab")
    public Lab addLab(@RequestBody Lab lab) {
        Lab persistedLab = labRepository.save(lab);
        return persistedLab;
    }
    @GetMapping("/getAllLabs")
    public List<Lab> getLabs()
    {
        List<Lab> persistedLabs = labRepository.findAll();
        return persistedLabs;
    }
    @GetMapping("/getLabByName")
    public Lab getLabByName(@RequestParam String name) {
        Lab lab = null;
        List<Lab> persistedLabs = labRepository.findAll();
        for (Lab l1 : persistedLabs) {
            if (l1.getName().equalsIgnoreCase(name))
            {
                return l1;
            }

        }
        return lab;
    }    
}
