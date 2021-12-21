package com.github.durakin.serverprogramming.lab4.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Faction.class)
public abstract class Faction_ {

	public static volatile SingularAttribute<Faction, Government> government;
	public static volatile SingularAttribute<Faction, System> homeSystem;
	public static volatile SingularAttribute<Faction, String> name;
	public static volatile SingularAttribute<Faction, Allegiance> allegiance;
	public static volatile SingularAttribute<Faction, Boolean> isPlayerFaction;
	public static volatile SingularAttribute<Faction, Integer> id;

	public static final String GOVERNMENT = "government";
	public static final String HOME_SYSTEM = "homeSystem";
	public static final String NAME = "name";
	public static final String ALLEGIANCE = "allegiance";
	public static final String IS_PLAYER_FACTION = "isPlayerFaction";
	public static final String ID = "id";

}

