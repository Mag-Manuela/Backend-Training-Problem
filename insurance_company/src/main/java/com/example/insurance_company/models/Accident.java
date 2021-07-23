package com.example.insurance_company.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date date;

    @JsonBackReference
    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
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

    @Override
    public String toString() {
        return "Accident{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", numberOfVictims=" + numberOfVictims +
                ", date=" + date +
                '}';
    }
}
