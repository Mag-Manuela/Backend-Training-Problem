package com.example.insurance_company.controllers;

import com.example.insurance_company.models.Accident;
import com.example.insurance_company.models.dto.AccidentDto;
import com.example.insurance_company.models.dto.AccidentsDto;
import com.example.insurance_company.services.IAccidentService;
import com.example.insurance_company.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class UserController {
    @Autowired
    private IAccidentService accidentService;

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/accidents")
    List<Accident> getAllAccidents(){
        return accidentService.findAll();
    }
}
