package com.exercise.tour.repository;

import com.exercise.tour.model.Cyclist;
import com.exercise.tour.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CyclistRepository extends JpaRepository<Cyclist, Integer> {

/*    //Querys personalizadas, get cyclist by nationality
    @Query(value = "SELECT c FROM Cyclist c WHERE c.nationality LIKE %:nationality%")
    List<Cyclist> findCyclistByNationality(@Param("nationality") String nationality, Integer teamId);*/

}
