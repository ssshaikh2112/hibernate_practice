package manyToManyBiDireMap;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		
		StudentManyToManyBiDir student=em.find(StudentManyToManyBiDir.class, 101);
		System.out.println(student);
		List<SubjectManyToManyBiDir> sub=student.getSubjects();
		for(SubjectManyToManyBiDir stud:sub) 
		{
			System.out.println(stud.getSubId());
			System.out.println(stud.getSubName());
		}
	}

}
