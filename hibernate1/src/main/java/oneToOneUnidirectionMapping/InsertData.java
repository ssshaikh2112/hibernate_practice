package oneToOneUnidirectionMapping;

import java.util.Scanner;

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
		
		
		Scanner scan=new Scanner(System.in);
		System.err.print("Enter ID : ");
		int id=scan.nextInt();
		System.out.print("Enter Name : ");
		String name=scan.next();
		System.out.print("Enter Phone Number : ");
		long phone=scan.nextLong();
		Person person=new Person();
		person.setId(id);
		person.setName(name);
		person.setPhone(phone);
		
		AdharCard adhaar=new AdharCard();
		System.out.print("Enter Adhar Number : ");
		int adharnum=scan.nextInt();
		adhaar.setAdharNumber(adharnum);
		System.out.print("Enter Address : ");
		String address=scan.next();
		adhaar.setAddress(address);
		
		// Giving adhaar card to person
		person.setAdharCard(adhaar);
		
		et.begin();
		em.persist(person);
		em.persist(adhaar);
		et.commit();
	}

}
