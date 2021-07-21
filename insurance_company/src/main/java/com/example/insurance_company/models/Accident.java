package com.example.insurance_company.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "accident")
public class Accident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "location")
    private String location;

    @Column(name = "numer_victims")
    private int numberOfVictims;

    @Column(name = "date")
    private Date date;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    public Accident() {
    }

    public Accident(String location, int numberOfVictims, Date date, User user) {
        this.location = location;
        this.numberOfVictims = numberOfVictims;
        this.date = date;
        this.user = user;
    }


}
