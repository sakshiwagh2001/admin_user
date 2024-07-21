package com.example.Registre_Login.config;

import com.example.Registre_Login.entity.User;
import com.example.Registre_Login.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

//    this method is verifyed that user is give the particular username(i give email as username) is write or not
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user=userRepo.findByEmail(username);

        if(user==null){
            throw  new UsernameNotFoundException("user not found");
        }else{
            return new CustomUser(user);
        }
    }
}
