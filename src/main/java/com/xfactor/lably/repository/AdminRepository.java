package com.xfactor.lably.repository;
import com.xfactor.lably.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
public interface AdminRepository extends JpaRepository<Admin,Long>
{
    Admin findByUsername(String username);

    Admin findByUsernameAndPassword(String username,String password);

    //@Query("SELECT admin FROM Admin admin WHERE admin.username = :username")
    //List<Admin> retrieveUsername(String username);
}
