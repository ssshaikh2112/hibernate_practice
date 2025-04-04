package crudopeartion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdateData 
{
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee emp=em.find(Employee.class, 103);
		emp.setEmpSal(2100);
		et.begin();
		em.merge(emp);
		et.commit();
	}

}
