package com.example.service;


import com.example.Enum.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dto.AuthResponse;
import com.example.dto.LoginRequest;
import com.example.dto.RegisterRequest;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.security.JWTUtil;


@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JWTUtil jwtUtil;


    public AuthResponse register(RegisterRequest request) {
        User user = new User();
        user.setName(request.name);
        user.setEmail(request.email);
        user.setPassword(request.password);
        user.setRole(request.role);
        userRepository.save(user);

        String token = jwtUtil.generateToken(user.getEmail(), user.getRole(),user.getName());
        return new AuthResponse(token, "User Registerd Successful");

    }

    //Login part
    public AuthResponse login(LoginRequest request) {

        User user = userRepository.findByEmail(request.email).orElseThrow(() -> new RuntimeException("User not found"));


        if (!passwordEncoder.matches(request.password, user.getPassword()))
            throw new RuntimeException("Invalid credentials");

        String token = jwtUtil.generateToken(user.getEmail(), user.getRole(),user.getName());
        return new AuthResponse(token, "Login Successful");


    }
}