package oneToOneMappingBidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AdharCardBirectionMapping card=em.find(AdharCardBirectionMapping.class, 1002);
		PersonBidirectionMapping person=card.getPerson();
		person.setName("Jonas Kanward");
		
		et.begin();
		em.merge(person);
		em.merge(card);
		et.commit();
	}

}
