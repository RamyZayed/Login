package com.example.login.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AppUserService implements UserDetailsService{

    @Autowired
    private AppRepository appRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        
        return appRepository.findByEmail(email)
            .orElseThrow(()-> new UsernameNotFoundException("User with email"+email+"is not found"));
    }
    
    
}