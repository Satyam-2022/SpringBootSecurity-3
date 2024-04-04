package com.example.springDemo2.controller;

import com.example.springDemo2.model.MyUser;
import com.example.springDemo2.reposiritry.MyUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final MyUserRepository myUserRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationController(MyUserRepository myUserRepository,PasswordEncoder passwordEncoder) {

        this.myUserRepository = myUserRepository;
        this.passwordEncoder=passwordEncoder;
    }

    @PostMapping("/register/user")
    public MyUser createUser(@RequestBody MyUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return myUserRepository.save(user);
    }


}
