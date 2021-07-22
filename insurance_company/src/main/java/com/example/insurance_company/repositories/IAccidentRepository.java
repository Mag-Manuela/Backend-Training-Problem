package com.example.insurance_company.repositories;

import com.example.insurance_company.models.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAccidentRepository extends JpaRepository<Accident, Long>{

    @Query("select u from Accident u where u.numberOfVictims = :#{#number}")
    List<Accident> filterByNumberOfVictims(@Param("number") int number);

}
