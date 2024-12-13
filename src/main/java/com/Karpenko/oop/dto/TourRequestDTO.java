package com.Karpenko.oop.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TourRequestDTO {
    
    @NotNull(message = "tour name cant be null")
    private String name;
    @NotNull(message = "tour numInDay cant be null")
    @Min(value = 1, message = "numInDay must be atleast 1")
    @Max(value = 7, message = "numInDay must no more that 7")
    private int numinday;
    @NotNull(message = "tour date cant be null")
    private String date;
    @NotNull(message = "tour tourGuy cant be null")
    private String tourGuy;
    @NotNull(message = "tour place cant be null")
    private String place;


    
    public void setName(String name) {
        this.name = name;
    }
    public void setNuminday(int numinday) {
        this.numinday = numinday;
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
   
    public String getName() {
        return name;
    }
    public int getNuminday() {
        return numinday;
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
