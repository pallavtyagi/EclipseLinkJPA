package com.pallav.jpa_work.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-22T16:11:29.557+0530")
@StaticMetamodel(Location.class)
public class Location_ {
	public static volatile SingularAttribute<Location, Long> locationId;
	public static volatile SingularAttribute<Location, String> city;
	public static volatile SingularAttribute<Location, String> postalCode;
	public static volatile SingularAttribute<Location, String> stateProvince;
	public static volatile SingularAttribute<Location, String> streetAddress;
	public static volatile SetAttribute<Location, Department> departments;
	public static volatile SingularAttribute<Location, Country> country;
}
