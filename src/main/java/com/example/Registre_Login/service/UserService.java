package com.example.Registre_Login.service;


import com.example.Registre_Login.entity.User;

public interface UserService {

    public User saveUser(User user);

    public  void removeSessionMassage();
}
