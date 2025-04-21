package oneToOneMappingBidirection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		PersonBidirectionMapping person=em.find(PersonBidirectionMapping.class, 101);
		
		// to fetch data of adhar card from person
		AdharCardBirectionMapping card=person.getCard();
		
		System.out.println(person);
		System.out.println(card);
	}

}
