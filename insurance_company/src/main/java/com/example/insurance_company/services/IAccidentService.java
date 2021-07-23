package com.example.insurance_company.services;

import com.example.insurance_company.models.Accident;
import com.example.insurance_company.models.User;

import java.util.List;

public interface IAccidentService {
    List<Accident> findAll();

    Accident getAccidentById(Long id);

    void deleteAccident(Long id);

    void updateAccident(Accident accident);

    void addAccident(Accident accident);

    List<Accident> findAccidentsWithZeroVictims();

    List<Accident> filterByVictimsNumber(int number);

    List<Accident> sortByDate();

    User getCurrentUser();
}
