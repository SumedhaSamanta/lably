package com.xfactor.lably.repository;

import com.xfactor.lably.entities.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab,Long>
{
    
}