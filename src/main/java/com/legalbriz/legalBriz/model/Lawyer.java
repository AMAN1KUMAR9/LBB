package com.legalbriz.legalBriz.model;

import jakarta.persistence.*;

@Entity
public class Lawyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;
    private float rating;
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
    public Lawyer(Long id, String name, String specialty, float rating, String experience,
                  String location, String languages, String fee, String availability, String bio) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.rating = rating;
        this.experience = experience;
        this.location = location;
        this.languages = languages;
        this.fee = fee;
        this.availability = availability;
        this.bio = bio;
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

    public float getRating() {
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
