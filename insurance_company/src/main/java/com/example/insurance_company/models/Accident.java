package com.example.insurance_company.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfVictims() {
        return numberOfVictims;
    }

    public void setNumberOfVictims(int numberOfVictims) {
        this.numberOfVictims = numberOfVictims;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
