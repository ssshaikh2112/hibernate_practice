package oneToOneMappingBidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// Incomplete
public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		PersonBidirectionMapping person=em.find(PersonBidirectionMapping.class, 102);
		AdharCardBirectionMapping card=person.getCard();
		
		
		et.begin();
		em.remove(person);

		et.commit();
	}

}
