package crudopeartion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLQuerySelectAllData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select e from Employee e");
		List<Employee> employees =query.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpSal());
			System.out.println("-------------");
		}
	}

}
