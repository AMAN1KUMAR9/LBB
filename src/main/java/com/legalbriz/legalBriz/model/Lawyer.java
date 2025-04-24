package com.legalbriz.legalBriz.model;

import jakarta.persistence.*;

@Entity
public class Lawyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;
    private double rating;
    private String experience;
    private String location;
    private String languages;
    private String fee;
    private String availability;
    private String bio;

    // Default constructor (required by JPA)
    public Lawyer() {
    }

    // Parameterized constructor (optional)
    public Lawyer(Long id, String availability, String bio, String experience, String fees, String languages,
                  String location, String name, double rating, String specialization) {
        this.id = id;
        this.availability = availability;
        this.bio = bio;
        this.experience = experience;
        this.fee = fees;
        this.languages = languages;
        this.location = location;
        this.name = name;
        this.rating = rating;
        this.specialty = specialization;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
