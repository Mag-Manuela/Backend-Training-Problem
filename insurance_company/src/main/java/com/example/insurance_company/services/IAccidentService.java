package com.example.insurance_company.services;

import com.example.insurance_company.models.Accident;

import java.util.List;

public interface IAccidentService {
    List<Accident> findAll();
}
