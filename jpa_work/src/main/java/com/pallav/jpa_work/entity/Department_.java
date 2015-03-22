package com.pallav.jpa_work.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-22T16:11:29.485+0530")
@StaticMetamodel(Department.class)
public class Department_ {
	public static volatile SingularAttribute<Department, Long> departmentId;
	public static volatile SingularAttribute<Department, String> departmentName;
	public static volatile SingularAttribute<Department, Employee> employee;
	public static volatile SingularAttribute<Department, Location> location;
	public static volatile SetAttribute<Department, Employee> employees;
	public static volatile SetAttribute<Department, JobHistory> jobHistories;
}
