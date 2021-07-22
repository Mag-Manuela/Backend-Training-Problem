package com.example.insurance_company.repositories;

import com.example.insurance_company.models.Accident;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAccidentRepositoryCustom {
    List<Accident> findByZeroNumberOfVictims();

    List<Accident> sortByDate();
}