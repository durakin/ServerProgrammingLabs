package com.github.durakin.serverprogramming.lab4.repository;

import com.github.durakin.serverprogramming.lab4.entity.Allegiance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AllegianceRepository extends JpaRepository <Allegiance, Integer> {
    Optional<Allegiance> findByAllegiance(String allegiance);
}
