package com.github.durakin.serverprogramming.lab4.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Commander.class)
public abstract class Commander_ {

	public static volatile SingularAttribute<Commander, Faction> faction;
	public static volatile SingularAttribute<Commander, String> name;
	public static volatile SingularAttribute<Commander, Integer> id;

	public static final String FACTION = "faction";
	public static final String NAME = "name";
	public static final String ID = "id";

}

