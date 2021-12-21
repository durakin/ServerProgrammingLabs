package com.github.durakin.isdlabs.lab6.repository;

import com.github.durakin.isdlabs.lab6.entity.Faction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApparelRepository extends JpaRepository<Faction, Integer> {
    List<Faction> findDistinctByPriceLessThan(Double price);
}
