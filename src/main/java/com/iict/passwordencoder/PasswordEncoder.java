package com.iict.passwordencoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PasswordEncoder {
    public static void main(String[] args) {
        String password = "1234";
        System.out.println(LocalDateTime.now());
//        System.out.println(password.substring(0, password.lastIndexOf(",")));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
    }
}
