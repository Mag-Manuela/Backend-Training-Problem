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

    @Override
    public Accident getAccidentById(Long id) {
        return accidentRepository.findById(id).get();
    }

    @Override
    public void deleteAccident(Long id) {
        accidentRepository.delete(this.getAccidentById(id));
    }

    @Override
    public void updateAccident(Accident accident) {

    }

    @Override
    public void addAccident(Accident accident) {
        accidentRepository.save(accident);
    }
}
