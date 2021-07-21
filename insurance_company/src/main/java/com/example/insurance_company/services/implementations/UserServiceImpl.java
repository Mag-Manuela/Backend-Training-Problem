package com.example.insurance_company.services.implementations;

import com.example.insurance_company.models.User;
import com.example.insurance_company.repositories.IUserRepository;
import com.example.insurance_company.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
