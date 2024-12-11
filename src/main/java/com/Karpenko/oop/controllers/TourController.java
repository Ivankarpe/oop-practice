package com.Karpenko.oop.controllers;

import java.util.ArrayList;
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

import com.Karpenko.oop.dto.TourDTO;
import com.Karpenko.oop.models.Tour;
import com.Karpenko.oop.services.TourService;

import jakarta.validation.Valid;

@Controller
public class TourController {

    @Autowired
    TourService tourService;
    
    @GetMapping(value = "/api/tour")
    private ResponseEntity<List<TourDTO>> readAll(){
        List<Tour> list = tourService.readAll();

        List<TourDTO> listDto = new ArrayList<TourDTO>();

        for(Tour tour: list){
            listDto.add(tourService.EntityToDTO(tour));
        }

        if (listDto == null || listDto.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(listDto, HttpStatus.OK);
    }


    @GetMapping(value = "/api/tour/{id}")
    public ResponseEntity<TourDTO> read(@PathVariable(name = "id") Long id) {
        final Tour tour = tourService.FindById(id);
        if (tour == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        TourDTO tourDto = tourService.EntityToDTO(tour);
        return new ResponseEntity<>(tourDto, HttpStatus.OK);
    }

    @PostMapping(value = "/api/tour")
    public ResponseEntity<?> create(@Valid @RequestBody TourDTO tourdto) {
        Tour tour = tourService.DTOToEntity(tourdto);
        tourService.create(tour);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/api/tour/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") long id, @Valid @RequestBody TourDTO tourDto) {
        Tour tour = tourService.DTOToEntity(tourDto);
        tourService.UpdateById(id, tour);

        return new ResponseEntity<>( HttpStatus.OK);
    }

    @DeleteMapping(value = "/api/tour/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") long id) {
        tourService.Delete(id);

        return new ResponseEntity<>(HttpStatus.OK );

    }











    
}
