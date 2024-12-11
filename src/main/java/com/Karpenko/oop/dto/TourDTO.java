package com.Karpenko.oop.dto;

import jakarta.validation.constraints.NotNull;

public class TourDTO {
    private Long id;
    @NotNull(message = "tour name cant be null")
    private String name;
    @NotNull(message = "tour numInDay cant be null")
    private int numInDay;
    @NotNull(message = "tour date cant be null")
    private String date;
    @NotNull(message = "tour tourGuy cant be null")
    private String tourGuy;
    @NotNull(message = "tour place cant be null")
    private String place;

    
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumInDay(int numInDay) {
        this.numInDay = numInDay;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTourGuy(String tourGuy) {
        this.tourGuy = tourGuy;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getNumInDay() {
        return numInDay;
    }
    public String getDate() {
        return date;
    }
    public String getTourGuy() {
        return tourGuy;
    }
    public String getPlace() {
        return place;
    }
}
