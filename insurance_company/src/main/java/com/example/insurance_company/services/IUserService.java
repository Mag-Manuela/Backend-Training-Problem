package com.example.insurance_company.services;

import com.example.insurance_company.models.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
}
