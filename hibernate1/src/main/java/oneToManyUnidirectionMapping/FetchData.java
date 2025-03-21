package oneToManyUnidirectionMapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank bank=em.find(Bank.class, 101);
		
		System.out.println(bank);
		List<Account> list =bank.getAccount();
		
		for (Account account : list) {
			System.out.println(account);
		}
	}

}
