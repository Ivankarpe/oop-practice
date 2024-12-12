package com.Karpenko.oop.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Karpenko.oop.models.Tour;

@Service
public class ScheduleService {

    @Autowired
    TourService tourService;

    public Map<String,List<Tour>> GetSchedule(){
        Map<String, List<Tour>> tours = new HashMap<>();

        tours.put("Monday", tourService.FindAllByDay("Monday"));
        tours.put("Tuesday", tourService.FindAllByDay("Tuesday"));
        tours.put("Wednesday", tourService.FindAllByDay("Wednesday"));
        tours.put("Thursday", tourService.FindAllByDay("Thursday"));
        tours.put("Friday", tourService.FindAllByDay("Friday"));


        return tours;
    }
}
