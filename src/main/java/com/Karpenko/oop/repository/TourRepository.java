package com.Karpenko.oop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Karpenko.oop.models.Tour;
@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {
    List<Tour> findAllByDate(String date);
}
