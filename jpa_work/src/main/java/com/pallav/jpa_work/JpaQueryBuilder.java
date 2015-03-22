package com.pallav.jpa_work;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import com.pallav.jpa_work.entity.*;

/**
 * Service class for getting the results
 * */
public class JpaQueryBuilder {

	public void executeQuery() {

		EntityManager entityManager = getEntityManager();
		CriteriaQuery<Tuple> criteriaQuery = entityManager.getCriteriaBuilder()
				.createTupleQuery();

		criteriaQuery = buildQuery(criteriaQuery,
				entityManager.getCriteriaBuilder(), null);
		printResults(entityManager.createQuery(criteriaQuery));
	}

	/**
	 * @return EntityManager
	 * 
	 * */
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("jpa_work")
				.createEntityManager();
	}

	// TODO add , QueryParameters parameters to this method to get the dynamic
	// where conditions.
	public CriteriaQuery<Tuple> buildQuery(CriteriaQuery<Tuple> query,
			CriteriaBuilder cb, String[] parameters) {
		Root<Employee> employee = query.from(Employee.class);
		Join<Employee, Department> department = employee
				.join(Employee_.department);

		query.multiselect(employee.get(Employee_.salary),
				employee.get(Employee_.firstName),
				employee.get(Employee_.lastName),
				employee.get(Employee_.hireDate),
				employee.get(Employee_.phoneNumber),
				department.get(Department_.departmentName),
				department.get(Department_.departmentId));

		// query.where(cb.in(department.get("departmentName"), "Marketing");
		query.where(cb.equal(department.get(Department_.departmentName),"Marketing"));

		return query;

	}

	public void printResults(Query query) {
		System.out.println("Sql Statement - " + query.toString());

		@SuppressWarnings("unchecked")
		List<Tuple> results = query.getResultList();
		for (int i = 0; i < results.size(); i++) {

			Tuple tuple = (Tuple) results.get(i);

			Object[] row = tuple.toArray();

			for (int j = 0; j < row.length; j++) {
				System.out.print(" " + tuple.get(j));
			}
		}
	}

}
