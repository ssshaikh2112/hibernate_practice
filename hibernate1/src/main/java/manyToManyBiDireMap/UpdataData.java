package manyToManyBiDireMap;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdataData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		StudentManyToManyBiDir student=em.find(StudentManyToManyBiDir.class, 103);
		student.setStudName("Urich");
		List<SubjectManyToManyBiDir> sub=student.getSubjects();
		
		System.out.println(sub);
		
		et.begin();
		em.merge(student);
		et.commit();
	}

}
