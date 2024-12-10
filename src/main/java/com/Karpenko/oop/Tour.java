package com.Karpenko.oop;

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
    private long id;
    private String name;
    private int count;
    private String date;
    private String tourGuy;
    private String place;

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
        this.count = count;
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
        return count;
    }
    public String getPlace() {
        return place;
    }
    public String getTourGuy() {
        return tourGuy;
    }
}
