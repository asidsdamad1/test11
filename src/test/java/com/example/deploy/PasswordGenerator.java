package com.example.deploy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "123456";
        String encodeedPassword = encoder.encode(rawPassword);

        System.out.println(encodeedPassword);
    }
}