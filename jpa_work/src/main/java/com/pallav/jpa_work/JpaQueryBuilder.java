package com.pallav.jpa_work;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.eclipse.persistence.jpa.JpaHelper;
import org.eclipse.persistence.queries.ReadAllQuery;

public class JpaQueryBuilder {
	
	public void executeQuery()
	{
		
		EntityManager entityManager = getEntityManager();
		CriteriaQuery<Tuple> criteriaQuery = entityManager.getCriteriaBuilder().createTupleQuery();
		
		criteriaQuery = buildQuery(criteriaQuery, entityManager.getCriteriaBuilder(), null);
		Query query = entityManager.createQuery(criteriaQuery);
		
		//ReadAllQuery raQuery = 
		//JpaHelper.getEntityManager(entityManager).getActiveSession().executeQuery(query);
		
		
		
	}
	
	public EntityManager getEntityManager(){
		return Persistence.createEntityManagerFactory("jpa_work").createEntityManager();
	}
	
	//TODO add , QueryParameters parameters to this method to get the dynamic where conditions.
	public CriteriaQuery<Tuple> buildQuery(CriteriaQuery<Tuple> query, CriteriaBuilder cb, String[] parameters)
	{
		return query;
		
	}
	

}
