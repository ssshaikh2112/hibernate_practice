package manyToManyBiDireMap;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		StudentManyToManyBiDir student1 = new StudentManyToManyBiDir();
		student1.setStudId(101);
		student1.setStudName("Jonas");

		StudentManyToManyBiDir student2 = new StudentManyToManyBiDir();
		student2.setStudId(102);
		student2.setStudName("Martha");

		StudentManyToManyBiDir student3 = new StudentManyToManyBiDir();
		student3.setStudId(103);
		student3.setStudName("Mikkel");

		SubjectManyToManyBiDir subject1 = new SubjectManyToManyBiDir();
		subject1.setSubId(1001);
		subject1.setSubName("JAVA");

		SubjectManyToManyBiDir subject2 = new SubjectManyToManyBiDir();
		subject2.setSubId(1002);
		subject2.setSubName("SQL");

		SubjectManyToManyBiDir subject3 = new SubjectManyToManyBiDir();
		subject3.setSubId(1003);
		subject3.setSubName("HIBERNATE");

		List<StudentManyToManyBiDir> studentList = new ArrayList<StudentManyToManyBiDir>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		List<SubjectManyToManyBiDir> subjectList = new ArrayList<SubjectManyToManyBiDir>();
		subjectList.add(subject1);
		subjectList.add(subject2);
		subjectList.add(subject3);
		
		student1.setSubjects(subjectList);
		student2.setSubjects(subjectList);
		student3.setSubjects(subjectList);
		
		subject1.setStudents(studentList);
		subject2.setStudents(studentList);
		subject3.setStudents(studentList);
		

		et.begin();
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(subject1);
		em.persist(subject2);
		em.persist(subject3);
		et.commit();

	}

}
