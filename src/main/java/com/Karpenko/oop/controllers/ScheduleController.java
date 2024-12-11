package com.Karpenko.oop.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Karpenko.oop.models.Tour;
import com.Karpenko.oop.services.ScheduleService;

@Controller
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @GetMapping(value = "/api/schedule")
    public ResponseEntity<?> getSchedule(){
        Map<String, List<Tour>> schedule = scheduleService.GetSchedule();

        return new ResponseEntity<>(schedule, HttpStatus.OK);

    }
}
