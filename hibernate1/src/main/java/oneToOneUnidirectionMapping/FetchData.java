package oneToOneUnidirectionMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Person person=em.find(Person.class, 101);
		AdharCard adhaar=person.getAdharCard();
		
		System.out.println("Person ID : "+person.getId());
		System.out.println("Person Name : "+person.getName());
		System.out.println("Person Phone : "+person.getPhone());
		System.out.println("==========================");
		System.out.println("Person Adhaar : "+adhaar.getAdharNumber());
		System.out.println("Person Adhhar : "+adhaar.getAddress());
	}

}
