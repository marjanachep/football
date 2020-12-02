package com.example.football.repository;

import com.example.football.model.Fan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FanRepository extends JpaRepository<Fan, Integer> {
    boolean existsByPlaysId(int playsId);

}
