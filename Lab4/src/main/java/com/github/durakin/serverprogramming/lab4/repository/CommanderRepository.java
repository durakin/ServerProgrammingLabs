package com.github.durakin.serverprogramming.lab4.repository;

import com.github.durakin.serverprogramming.lab4.entity.Commander;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Optional;

@Repository
public interface CommanderRepository extends JpaRepository<Commander, Integer> {
    Optional<Commander> findById(Integer integer);
}