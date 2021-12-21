package com.github.durakin.serverprogramming.lab4.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Commodity.class)
public abstract class Commodity_ {

	public static volatile SetAttribute<Commodity, Listing> listings;
	public static volatile SingularAttribute<Commodity, Integer> edId;
	public static volatile SingularAttribute<Commodity, String> name;
	public static volatile SingularAttribute<Commodity, Integer> id;
	public static volatile SingularAttribute<Commodity, String> category;

	public static final String LISTINGS = "listings";
	public static final String ED_ID = "edId";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String CATEGORY = "category";

}

