package oneToOneMappingBidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDataNoCol {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		PersonBideirectionMapNoExtraCol person =new PersonBideirectionMapNoExtraCol();
		person.setId(102);
		person.setName("Martha");
		person.setPhone(88552233);
		
		AdharCardBideirectionMapNoExtraCol adhar=new AdharCardBideirectionMapNoExtraCol();
		adhar.setAdharNumber(1002);
		adhar.setAddress("Germany");
		
		person.setCard(adhar);
		adhar.setPerson(person);
		
		et.begin();
		em.persist(person);
		em.persist(adhar);
		et.commit();
		
		
		
	}

}
