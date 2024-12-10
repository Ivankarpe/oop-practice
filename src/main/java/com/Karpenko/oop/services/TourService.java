package com.Karpenko.oop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Karpenko.oop.models.Tour;
import com.Karpenko.oop.repository.TourRepository;

@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    public void create(Tour tour){
        tourRepository.save(tour);
    }

    public List<Tour> readAll(){
        List<Tour> list = (List<Tour>) tourRepository.findAll();
        return list; 
    }

    public Tour FindById(Long id){
        Tour tour = tourRepository.findById(id).get();
        return tour;
    }

    public void UpdateById(Long id, Tour tour){
        tour.setId(id);
        tourRepository.save(tour);
    }

    public void Delete(Long id){
        tourRepository.deleteById(id);
    }
}
