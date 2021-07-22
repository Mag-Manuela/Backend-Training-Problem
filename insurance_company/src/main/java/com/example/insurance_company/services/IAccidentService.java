package com.example.insurance_company.services;

import com.example.insurance_company.models.Accident;

import java.util.List;

public interface IAccidentService {
    List<Accident> findAll();
    Accident getAccidentById(Long id);
    void deleteAccident(Long id);
    void updateAccident(Accident accident);
    void addAccident(Accident accident);
}
