package com.Karpenko.oop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tours")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "numinday")
    private int numInDay;
    private String date;
    private String tourGuy;
    private String place;

    
    public Tour() {
    }
    public Tour(String name, int count, String date, String tourGuy, String place) {
        this.name = name;
        this.numInDay = count;
        this.date = date;
        this.tourGuy = tourGuy;
        this.place = place;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int count) {
        this.numInDay = count;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void setTourGuy(String tourGuy) {
        this.tourGuy = tourGuy;
    }
    public long getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return numInDay;
    }
    public String getPlace() {
        return place;
    }
    public String getTourGuy() {
        return tourGuy;
    }
}
