package com.github.durakin.serverprogramming.lab4.repository;

import com.github.durakin.serverprogramming.lab4.entity.Faction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FactionRepository extends JpaRepository<Faction, Integer> {
    Optional<Faction> findById(Integer id);

    Optional<Faction> findByName(String name);

    long deleteByName(String name);
}