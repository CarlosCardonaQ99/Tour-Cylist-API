package com.exercise.tour.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
//@Builder(toBuilder = true) //patrón de diseño
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cyclists")
public class Cyclist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "The name is required")
    private String name;
    @NotEmpty(message = "The nationality is required")
    private String nationality;


    @ManyToOne()
    @JoinColumn(name = "teamId")
    private Team team;


}
