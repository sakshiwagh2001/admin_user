package com.example.Registre_Login.repository;

import com.example.Registre_Login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    public  User findByEmail(String  email);
}
