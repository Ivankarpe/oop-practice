package com.Karpenko.oop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Karpenko.oop.models.Tour;
import com.Karpenko.oop.services.TourService;

@Controller
public class TourController {

    @Autowired
    TourService tourService;
    
    @GetMapping(value = "/api/tour")
    private ResponseEntity<List<Tour>> readAll(){
        List<Tour> list = tourService.readAll();

        if (list == null || list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping(value = "/api/tour/{id}")
    public ResponseEntity<Tour> read(@PathVariable(name = "id") Long id) {
        final Tour tour = tourService.FindById(id);
        if (tour == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(tour, HttpStatus.OK);
    }

    @PostMapping(value = "/api/tour")
    public ResponseEntity<?> create(@RequestBody Tour tour) {
        tourService.create(tour);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/api/tour/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") long id, @RequestBody Tour tour) {
        tourService.UpdateById(id, tour);

        return new ResponseEntity<>( HttpStatus.OK);
    }

    @DeleteMapping(value = "/api/tour/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") long id) {
        tourService.Delete(id);

        return new ResponseEntity<>(HttpStatus.OK );

    }











    
}
