package com.exercise.tour.repository;

import com.exercise.tour.model.Cyclist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CyclistRepository extends JpaRepository<Cyclist, Integer> {

    //Querys personalizadas
}
