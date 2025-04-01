package crudopeartion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDeleteData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee emp=em.find(Employee.class,104);
		if (emp != null) {
			et.begin();
			em.remove(emp);;
			et.commit();
		}
		else {
			
			System.out.println("INVALID ID");
		}
	}

}
