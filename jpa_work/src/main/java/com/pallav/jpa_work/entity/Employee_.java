package com.pallav.jpa_work.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-22T16:11:29.509+0530")
@StaticMetamodel(Employee.class)
public class Employee_ {
	public static volatile SingularAttribute<Employee, Long> employeeId;
	public static volatile SingularAttribute<Employee, BigDecimal> commissionPct;
	public static volatile SingularAttribute<Employee, String> email;
	public static volatile SingularAttribute<Employee, String> firstName;
	public static volatile SingularAttribute<Employee, Date> hireDate;
	public static volatile SingularAttribute<Employee, String> lastName;
	public static volatile SingularAttribute<Employee, String> phoneNumber;
	public static volatile SingularAttribute<Employee, BigDecimal> salary;
	public static volatile SetAttribute<Employee, Department> departments;
	public static volatile SingularAttribute<Employee, Department> department;
	public static volatile SingularAttribute<Employee, Employee> employee;
	public static volatile SetAttribute<Employee, Employee> employees;
	public static volatile SingularAttribute<Employee, Job> job;
	public static volatile SetAttribute<Employee, JobHistory> jobHistories;
}
