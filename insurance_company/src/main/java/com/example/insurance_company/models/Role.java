package com.example.insurance_company.models;

public enum Role {
    B("BROKER"),
    C("CUSTOMER");

    public String role;

    Role(String role) {
        this.role = role;
    }
}
