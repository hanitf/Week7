package com.ironhack.exerciseweek7;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "philosophers")
@ToString
public class Philosopher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "philosophers_name")
    private String name;
    @Column(name = "philosophers_school")
    private String school;


    public Philosopher(String name, String school) {
        this.name = name;
        this.school = school;
    }
}