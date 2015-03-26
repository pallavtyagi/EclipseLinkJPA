package com.pallav.jpa_work.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-22T16:11:29.538+0530")
@StaticMetamodel(Job.class)
public class Job_ {
	public static volatile SingularAttribute<Job, String> jobId;
	public static volatile SingularAttribute<Job, String> jobTitle;
	public static volatile SingularAttribute<Job, BigDecimal> maxSalary;
	public static volatile SingularAttribute<Job, BigDecimal> minSalary;
	public static volatile SetAttribute<Job, Employee> employees;
	public static volatile SetAttribute<Job, JobHistory> jobHistories;
}
