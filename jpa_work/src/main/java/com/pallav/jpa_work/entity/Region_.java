package com.pallav.jpa_work.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-22T16:11:29.570+0530")
@StaticMetamodel(Region.class)
public class Region_ {
	public static volatile SingularAttribute<Region, Long> regionId;
	public static volatile SingularAttribute<Region, String> regionName;
	public static volatile SetAttribute<Region, Country> countries;
}
