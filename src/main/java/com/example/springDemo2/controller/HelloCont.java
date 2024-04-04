package com.example.springDemo2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloCont {
   @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("welcome home");
    }
    @GetMapping("/admin/home")
    public ResponseEntity<String> handleAdminHome() {
        return ResponseEntity.ok("Welcome ADmIn ");
    }

    @GetMapping("/user/home")
    public ResponseEntity<String> handleUserHome() {
        return ResponseEntity.ok("Welcome USER");
    }

}
