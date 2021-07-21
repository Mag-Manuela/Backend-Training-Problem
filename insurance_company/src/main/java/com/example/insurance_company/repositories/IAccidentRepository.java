package com.example.insurance_company.repositories;

import com.example.insurance_company.models.Accident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccidentRepository extends JpaRepository<Accident, Long>{

}
