package com.github.durakin.serverprogramming.lab4.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Listing.class)
public abstract class Listing_ {

	public static volatile SingularAttribute<Listing, Integer> buyPrice;
	public static volatile SingularAttribute<Listing, Commodity> commodity;
	public static volatile SingularAttribute<Listing, Station> station;
	public static volatile SingularAttribute<Listing, Integer> sellPrice;
	public static volatile SingularAttribute<Listing, ListingId> id;
	public static volatile SingularAttribute<Listing, Integer> supply;
	public static volatile SingularAttribute<Listing, Integer> demand;

	public static final String BUY_PRICE = "buyPrice";
	public static final String COMMODITY = "commodity";
	public static final String STATION = "station";
	public static final String SELL_PRICE = "sellPrice";
	public static final String ID = "id";
	public static final String SUPPLY = "supply";
	public static final String DEMAND = "demand";

}

