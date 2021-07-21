package com.example.insurance_company.services;

import com.example.insurance_company.models.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
}
