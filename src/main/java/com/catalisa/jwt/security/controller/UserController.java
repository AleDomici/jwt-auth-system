package com.catalisa.jwt.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String user() {
        return "Bem-vindo, usuário!";
    }
}
