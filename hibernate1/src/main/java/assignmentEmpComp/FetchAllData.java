package assignmentEmpComp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select e from EmployeeData e where e.id=1001");
		
		List<EmployeeData> result=query.getResultList();	//getsingleResult(); for single reord
		for(EmployeeData emp:result)
		{
			System.out.println("Emp ID : "+emp.getEmpId());
			System.out.println("Em"
					+ "p Name : "+emp.getEmpName());
			System.out.println("Emp Salary : "+emp.getEmpSalary());
			
		}
	}

}
