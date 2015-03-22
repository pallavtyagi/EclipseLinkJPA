/**
 * 
 */
package com.pallav.jpa_work;



import javax.persistence.EntityManager;

import com.pallav.jpa_work.entity.Department;
import com.pallav.jpa_work.entity.Employee;



/**
 * @author Pallav
 *
 */
public class JpaTransaction {
	

	/**
	 * method to update the employee database with department table.
	 * */
	
	@SuppressWarnings("deprecation")
	public void createTransaction()
	{
		EntityManager entityManager = PersistanceEngine.getEntityManager();
		entityManager.getTransaction().begin();
		
		Employee employee = new Employee();
		
		employee.setEmail("pallav.tyagi@ymail.com");
		employee.setFirstName("Pallav");
		employee.setLastName("Tyagi");
		employee.setHireDate(new java.util.Date("13-Mar-2015"));
		employee.setPhoneNumber("501023233");
		
		
		
		Department department=employee.getDepartment(); 
		employee.setDepartment(department);
		
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		
		
	}
}
