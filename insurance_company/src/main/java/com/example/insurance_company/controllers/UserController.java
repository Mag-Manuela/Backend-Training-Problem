package com.example.insurance_company.controllers;

import com.example.insurance_company.exceptions.AccidentNotFoundException;
import com.example.insurance_company.models.Accident;
import com.example.insurance_company.models.User;
import com.example.insurance_company.models.dto.AccidentDto;
import com.example.insurance_company.models.dto.AccidentsDto;
import com.example.insurance_company.services.IAccidentService;
import com.example.insurance_company.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
public class UserController {
    @Autowired
    private IAccidentService accidentService;

    @GetMapping(value = "/accidents/list")
    List<Accident> getAllAccidents(){
        return accidentService.findAll();
    }

    @GetMapping("/accidents/{id}")
    public Accident getAccident(@PathVariable Long id) {

        Accident accident = accidentService.getAccidentById(id);

        if (accident == null) {
            throw new AccidentNotFoundException("Accident not found");
        }

        return accident;
    }

    @PostMapping("accidents/broker/add")
    public Accident addAccident(@RequestBody Accident accident){
        accident.setId(0L);
        System.out.println("In Controller =>>>>>>>" + accident.getUser().getFirstName());
        accidentService.addAccident(accident);

        return accident;
    }

    @DeleteMapping("accidents/broker/delete/{id}")
    public String deleteAccident(@PathVariable Long id){
        accidentService.deleteAccident(id);
        return "Accident deleted successfully!";
    }


}
