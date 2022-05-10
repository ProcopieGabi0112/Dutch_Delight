package com.example.Dutch.Delight.Service.User_Service;

import com.example.Dutch.Delight.Model.User;
import com.example.Dutch.Delight.Repository.UserRepository;
import com.example.Dutch.Delight.Security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        User user=repo.findByEmail(email);
        if(user ==null)
            throw new UsernameNotFoundException("User not found");
        return new CustomUserDetails(user);
    }
}
