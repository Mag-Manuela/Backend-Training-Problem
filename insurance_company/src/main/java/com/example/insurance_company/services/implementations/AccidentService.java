package com.example.insurance_company.services.implementations;

import com.example.insurance_company.models.Accident;
import com.example.insurance_company.repositories.IAccidentRepository;
import com.example.insurance_company.services.IAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccidentService implements IAccidentService{
    @Autowired
    private IAccidentRepository accidentRepository;

    @Override
    @Transactional
    public List<Accident> findAll() {
        return accidentRepository.findAll();
    }
}
