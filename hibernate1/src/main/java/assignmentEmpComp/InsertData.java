package assignmentEmpComp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Company company=new Company();
		company.setCompId(101);
		company.setCompName("TCS");
		company.setCompLocation("Pune");
		
		EmployeeData employee1=new EmployeeData();
		employee1.setEmpId(1001);
		employee1.setEmpName("Jonas");
		employee1.setEmpSalary(45000);
		employee1.setCompany(company);
		
		EmployeeData employee2=new EmployeeData();
		employee2.setEmpId(1002);
		employee2.setEmpName("Martha");
		employee2.setEmpSalary(35000);
		employee2.setCompany(company);

		List<EmployeeData> list=new ArrayList<EmployeeData>();
		list.add(employee1);
		list.add(employee2);
		
		
		company.setEmpData(list);
		
		et.begin();
		em.persist(company);
		em.persist(employee1);
		em.persist(employee2);
		et.commit();

		
	}

}
