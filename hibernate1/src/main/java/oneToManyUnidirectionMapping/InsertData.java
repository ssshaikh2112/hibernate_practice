package oneToManyUnidirectionMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToOneUnidirectionMapping.Person;

public class InsertData {
	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Bank bank=new Bank();
		bank.setId(101);
		bank.setName("SBI");
		bank.setBranch("Pune");
		
		Account account1=new Account();
		account1.setAccountID(1001);
		account1.setName("Jonas");
		account1.setBalanace(15000);
		
		Account account2=new Account();
		account2.setAccountID(1002);
		account2.setName("Martha");
		account2.setBalanace(25000);
		
		Account account3=new Account();
		account3.setAccountID(1003);
		account3.setName("Mikkel");
		account3.setBalanace(10000);
		
		List<Account> list=new ArrayList<Account>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		
		bank.setAccount(list);
		
		et.begin();
		em.persist(bank);
		em.persist(account1);
		em.persist(account2);
		em.persist(account3);
		et.commit();
		
		
	}
	

}
