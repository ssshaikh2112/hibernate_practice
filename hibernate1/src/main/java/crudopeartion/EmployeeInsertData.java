package crudopeartion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsertData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee emp=new Employee();
		emp.setEmpId(105);
		emp.setEmpName("Noa");
		emp.setEmpSal(51000);

		
		et.begin();
		em.persist(emp);
		System.out.println("DATA INSERTED");
		et.commit();
	}

}
