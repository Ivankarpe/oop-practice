package com.Karpenko.oop.controllers;

import java.util.Base64;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AuthController {

    @Value("${credentials.username}")
    private String adminUsername;

    @Value("${credentials.password}")
    private String adminPassword;

    @PostMapping(value = "/api/auth")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials){
        String username = credentials.get("username");
        String password = credentials.get("password");


        if(adminPassword.equals(password) && adminUsername.equals(username)){
            Long timeExpr = System.currentTimeMillis() +5*60*1000;
            String token = Base64.getEncoder().encodeToString((username+":" + timeExpr).getBytes());
            return ResponseEntity.ok().body(Map.of("token", token));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }

}
