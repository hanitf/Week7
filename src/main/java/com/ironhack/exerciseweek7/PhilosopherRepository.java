package com.ironhack.exerciseweek7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhilosopherRepository extends JpaRepository<Philosopher, Long> {
}
