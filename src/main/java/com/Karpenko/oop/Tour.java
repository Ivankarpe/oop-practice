package com.Karpenko.oop;

public class Tour {
    private String name;
    private int number;
    private String date;
    private String tourGuy;
    private String place;

    public void setDate(String date) {
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void setTourGuy(String tourGuy) {
        this.tourGuy = tourGuy;
    }
    public String getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public String getPlace() {
        return place;
    }
    public String getTourGuy() {
        return tourGuy;
    }
}
