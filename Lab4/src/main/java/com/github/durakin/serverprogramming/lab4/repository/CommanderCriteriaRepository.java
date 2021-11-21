package com.github.durakin.serverprogramming.lab4.repository;

import com.github.durakin.serverprogramming.lab4.entity.Allegiance;
import com.github.durakin.serverprogramming.lab4.entity.Commander;
import com.github.durakin.serverprogramming.lab4.entity.Faction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Repository
public class CommanderCriteriaRepository {
    private final EntityManager entityManager;
    private final CriteriaBuilder criteriaBuilder;

    public CommanderCriteriaRepository(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }


    public void InsertCommander(Commander commander) {
        this.entityManager.persist(commander);
    }

    public List<Commander> FindByFactionName(String name) {

        CriteriaQuery<Commander> commanderCriteriaQuery = criteriaBuilder.createQuery(Commander.class);
        Root<Commander> root = commanderCriteriaQuery.from(Commander.class);
        Join<Commander, Faction> factionJoin = root.join("faction");
        commanderCriteriaQuery.where(criteriaBuilder.equal(factionJoin.get("name"), name));

        return entityManager.createQuery(commanderCriteriaQuery).getResultList();
    }

    public List<Commander> FindByAllegianceName(String allegiance) {

        CriteriaQuery<Commander> commanderCriteriaQuery = criteriaBuilder.createQuery(Commander.class);
        Root<Commander> root = commanderCriteriaQuery.from(Commander.class);
        Join<Commander, Faction> factionJoin = root.join("faction");
        Join<Faction, Allegiance> allegianceJoin = factionJoin.join("allegiance");
        commanderCriteriaQuery.where(criteriaBuilder.equal(allegianceJoin.get("allegiance"), allegiance));
        return entityManager.createQuery(commanderCriteriaQuery).getResultList();
    }
}
