package com.example.agricultureloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.agricultureloan.repository.UserRepository;

@Service
public class SecurityService implements UserDetailsService {

    @Autowired
    UserRepository UserRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        // return UserRepo.findByEmail(username);
        return UserRepo.findByEmail(username).orElse(null);
    }
    
}
