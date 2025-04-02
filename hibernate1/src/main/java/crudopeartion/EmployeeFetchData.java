package crudopeartion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EmployeeFetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Employee emp = em.find(Employee.class, 102);
		if (emp != null) 
		{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpSal());
			System.out.println("--------------");
		} else {
			System.out.println("INVALID PK");
		}
	}

}
