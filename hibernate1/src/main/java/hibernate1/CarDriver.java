package hibernate1;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		CarDetail car=new CarDetail();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter car number : ");
		long carnum=scan.nextLong();
		System.out.println("Enter Car Model : ");
		String carmodel=scan.next();
		System.out.println("Enter Car Price : ");
		int carprice=scan.nextInt();
		System.out.println("Enter Car Name : ");
		String carname=scan.next();
		
		car.setCarNumber(carnum);
		car.setCarModel(carmodel);
		car.setCarPrice(carprice);
		car.setCarName(carname);
		
		
		et.begin();
		em.persist(car);
		System.out.println("Data Saved");
		et.commit();
	}

}
