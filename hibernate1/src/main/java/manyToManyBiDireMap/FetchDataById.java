package manyToManyBiDireMap;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataById {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select stud from StudentManyToManyBiDir stud where stud.studId=103");
		List result=query.getResultList();
		System.out.println(result);
	}

}
