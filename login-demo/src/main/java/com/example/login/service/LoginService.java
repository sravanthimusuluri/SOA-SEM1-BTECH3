package com.example.login.service;

import org.springframework.stereotype.Service;

import com.example.login.model.LoginRequest;
import com.example.login.model.LoginResponse;

@Service
public class LoginService {

    public LoginResponse login(LoginRequest request) {

        String username = request.getUsername();
        String password = request.getPassword();

       
        if (username.equals("admin") && password.equals("1234")) {

            return new LoginResponse(
                    "Login Successful",
                    true
            );

        } else {

            return new LoginResponse(
                    "Invalid Username or Password",
                    false
            );
        }
    }
}