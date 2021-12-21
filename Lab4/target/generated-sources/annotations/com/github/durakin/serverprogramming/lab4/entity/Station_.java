package com.github.durakin.serverprogramming.lab4.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Station.class)
public abstract class Station_ {

	public static volatile SingularAttribute<Station, Boolean> hasCarrierAdministration;
	public static volatile SingularAttribute<Station, Boolean> hasBlackmarket;
	public static volatile SingularAttribute<Station, Boolean> hasMarket;
	public static volatile SingularAttribute<Station, StationType> type;
	public static volatile SingularAttribute<Station, Integer> distanceToStar;
	public static volatile SetAttribute<Station, Listing> listings;
	public static volatile SingularAttribute<Station, Government> government;
	public static volatile SingularAttribute<Station, Boolean> hasUniversalCartographics;
	public static volatile SingularAttribute<Station, Boolean> hasTechnologyBroker;
	public static volatile SingularAttribute<Station, Integer> id;
	public static volatile SingularAttribute<Station, Boolean> hasRefuel;
	public static volatile SingularAttribute<Station, Integer> bodyId;
	public static volatile SingularAttribute<Station, Boolean> hasShipyard;
	public static volatile SingularAttribute<Station, Boolean> isPlanetary;
	public static volatile SingularAttribute<Station, Boolean> hasCommodities;
	public static volatile SingularAttribute<Station, Boolean> hasRearm;
	public static volatile SingularAttribute<Station, Allegiance> allegiance;
	public static volatile SingularAttribute<Station, Boolean> hasOutfitting;
	public static volatile SingularAttribute<Station, Boolean> hasInterstellarFactors;
	public static volatile SingularAttribute<Station, Double> edMarketId;
	public static volatile SingularAttribute<Station, System> system;
	public static volatile SingularAttribute<Station, Faction> controllingMinorFaction;
	public static volatile SingularAttribute<Station, Boolean> hasDocking;
	public static volatile SingularAttribute<Station, String> name;
	public static volatile SingularAttribute<Station, Boolean> hasCarrierVendor;
	public static volatile SingularAttribute<Station, String> maxLandingPadSize;
	public static volatile SingularAttribute<Station, Boolean> hasRepair;
	public static volatile SingularAttribute<Station, Boolean> hasMaterialTrader;

	public static final String HAS_CARRIER_ADMINISTRATION = "hasCarrierAdministration";
	public static final String HAS_BLACKMARKET = "hasBlackmarket";
	public static final String HAS_MARKET = "hasMarket";
	public static final String TYPE = "type";
	public static final String DISTANCE_TO_STAR = "distanceToStar";
	public static final String LISTINGS = "listings";
	public static final String GOVERNMENT = "government";
	public static final String HAS_UNIVERSAL_CARTOGRAPHICS = "hasUniversalCartographics";
	public static final String HAS_TECHNOLOGY_BROKER = "hasTechnologyBroker";
	public static final String ID = "id";
	public static final String HAS_REFUEL = "hasRefuel";
	public static final String BODY_ID = "bodyId";
	public static final String HAS_SHIPYARD = "hasShipyard";
	public static final String IS_PLANETARY = "isPlanetary";
	public static final String HAS_COMMODITIES = "hasCommodities";
	public static final String HAS_REARM = "hasRearm";
	public static final String ALLEGIANCE = "allegiance";
	public static final String HAS_OUTFITTING = "hasOutfitting";
	public static final String HAS_INTERSTELLAR_FACTORS = "hasInterstellarFactors";
	public static final String ED_MARKET_ID = "edMarketId";
	public static final String SYSTEM = "system";
	public static final String CONTROLLING_MINOR_FACTION = "controllingMinorFaction";
	public static final String HAS_DOCKING = "hasDocking";
	public static final String NAME = "name";
	public static final String HAS_CARRIER_VENDOR = "hasCarrierVendor";
	public static final String MAX_LANDING_PAD_SIZE = "maxLandingPadSize";
	public static final String HAS_REPAIR = "hasRepair";
	public static final String HAS_MATERIAL_TRADER = "hasMaterialTrader";

}

