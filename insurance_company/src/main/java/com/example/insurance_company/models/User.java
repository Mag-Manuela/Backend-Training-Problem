package com.example.insurance_company.models;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cnp")
    private String cnp;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role")
    private String role;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;



    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String cnp, String firstName, String lastName, String role) {
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

}
