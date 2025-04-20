package com.batch2.artifact1.domain;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

  @Entity
public class booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Add this line to automatically generate IDs
    private Long id;

    private String name;
    private String email;
    private String car;
    private String date;

    // Constructors, getters and setters remain unchanged



    // Default constructor
    public booking() {
    }

    // Constructor with fields
    public booking(String name, String email, String car, String date) {
        this.name = name;
        this.email = email;
        this.car = car;
        this.date = date;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


