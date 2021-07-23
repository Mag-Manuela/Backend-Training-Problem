package com.example.insurance_company.controllers;

import com.example.insurance_company.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    private IUserRepository userRepo;

    @GetMapping("")
    public String viewHomePage() {
        return "login";
    }
}
