package oneToOneUnidirectionMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// incomplete
public class DeleteData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		// It need to search and update the value
		
		//Person person =em.find(Person.class, 105);	//--> it delete from person table done
		
		
		AdharCard person=em.find(AdharCard.class,1003);
	//	AdharCard card=person.getAdharCard();
		
		//AdharCard adhar=new AdharCard();
		et.begin();
		em.remove(person);
		et.commit();
		
	}

}
