package com.pallav.jpa_work.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-22T16:11:29.454+0530")
@StaticMetamodel(Country.class)
public class Country_ {
	public static volatile SingularAttribute<Country, String> countryId;
	public static volatile SingularAttribute<Country, String> countryName;
	public static volatile SingularAttribute<Country, Region> region;
	public static volatile SetAttribute<Country, Location> locations;
}
