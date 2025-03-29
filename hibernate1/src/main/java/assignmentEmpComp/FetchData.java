package assignmentEmpComp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Company company=em.find(Company.class,101);
		List<EmployeeData> emp=company.getEmpData();
		
		for(EmployeeData comp:emp) {
			System.out.println(comp.getEmpId());
			System.out.println(comp.getEmpName());
			System.out.println(comp.getEmpSalary());
		}
		
	}

}
