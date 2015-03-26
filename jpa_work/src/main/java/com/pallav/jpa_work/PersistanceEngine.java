package com.pallav.jpa_work;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PersistanceEngine {
	
	public static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("jpa_work").createEntityManager();
	}

}
