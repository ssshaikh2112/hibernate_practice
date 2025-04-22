package oneToOneUnidirectionMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		// It need to search and update the value
		Person person=em.find(Person.class, 103);
		AdharCard adhaar=person.getAdharCard();
		//adhaar.setAdharNumber(102);
		person.setId(102);
		et.begin();
		// for update or persist() also applicable.
		em.merge(person);
		et.commit();
		
	}

}
