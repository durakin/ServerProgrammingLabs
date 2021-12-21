package com.github.durakin.serverprogramming.lab4.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(System.class)
public abstract class System_ {

	public static volatile SingularAttribute<System, Boolean> isPopulated;
	public static volatile SingularAttribute<System, Integer> edsmId;
	public static volatile SingularAttribute<System, ReserveType> reserveType;
	public static volatile SingularAttribute<System, Allegiance> allegiance;
	public static volatile SingularAttribute<System, Double> population;
	public static volatile SingularAttribute<System, Boolean> needsPermit;
	public static volatile SingularAttribute<System, Security> security;
	public static volatile SingularAttribute<System, Government> government;
	public static volatile SingularAttribute<System, PowerState> powerState;
	public static volatile SingularAttribute<System, Faction> controllingMinorFaction;
	public static volatile SingularAttribute<System, String> name;
	public static volatile SingularAttribute<System, Double> x;
	public static volatile SingularAttribute<System, Double> y;
	public static volatile SingularAttribute<System, Double> z;
	public static volatile SingularAttribute<System, Integer> id;
	public static volatile SingularAttribute<System, String> power;
	public static volatile SingularAttribute<System, Economy> primaryEconomy;
	public static volatile SingularAttribute<System, Double> edSystemAddress;

	public static final String IS_POPULATED = "isPopulated";
	public static final String EDSM_ID = "edsmId";
	public static final String RESERVE_TYPE = "reserveType";
	public static final String ALLEGIANCE = "allegiance";
	public static final String POPULATION = "population";
	public static final String NEEDS_PERMIT = "needsPermit";
	public static final String SECURITY = "security";
	public static final String GOVERNMENT = "government";
	public static final String POWER_STATE = "powerState";
	public static final String CONTROLLING_MINOR_FACTION = "controllingMinorFaction";
	public static final String NAME = "name";
	public static final String X = "x";
	public static final String Y = "y";
	public static final String Z = "z";
	public static final String ID = "id";
	public static final String POWER = "power";
	public static final String PRIMARY_ECONOMY = "primaryEconomy";
	public static final String ED_SYSTEM_ADDRESS = "edSystemAddress";

}

