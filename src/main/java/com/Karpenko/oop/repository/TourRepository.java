package com.Karpenko.oop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Karpenko.oop.models.Tour;
@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {}
