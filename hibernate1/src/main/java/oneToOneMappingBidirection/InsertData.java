package oneToOneMappingBidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		PersonBidirectionMapping person =new PersonBidirectionMapping();
		person.setId(102);
		person.setName("Jonas");
		person.setPhone(1222222222);
	
		AdharCardBirectionMapping card =new AdharCardBirectionMapping();
		card.setAdharNumber(1002);
		card.setAddress("windon");
		
		// give data of Adharcard to person
		person.setCard(card);
		
		// give data of person to Adharcard
		card.setPerson(person);
		
		et.begin();
		em.persist(card);
		em.persist(person);
		et.commit();
	}

}
