package org.jsp.manytomanyuni;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
	EntityManager em=emf.createEntityManager();
	EntityTransaction etran=em.getTransaction();
	etran.begin();
	Batch b1=new Batch();
	b1.setBatch_code("A17");
	b1.setSubject("Java");
	b1.setTrainer("Keshava");
	
	Batch b2=new Batch();
	b2.setBatch_code("M17");
	b2.setSubject("JDBC");
	b2.setTrainer("GuruRaj");
	
	Student s1=new Student();
	s1.setName("A");
	s1.setPhone(98754322l);
	s1.setMarks(94.50);
	
	Student s2=new Student();
	s2.setName("B");
	s2.setPhone(99754322l);
	s2.setMarks(64.50);
	
	Student s3=new Student();
	s3.setName("C");
	s3.setPhone(620754322l);
	s3.setMarks(76.50);
	
	Student s4=new Student();
	s4.setName("D");
	s4.setPhone(67754322l);
	s4.setMarks(62.20);
	
	b1.setStudents(Arrays.asList(s1,s2,s3,s4));
	b2.setStudents(Arrays.asList(s1,s3));
	
	List<Batch> bl=Arrays.asList(b1,b2);
	for (Batch b : bl) {
		em.persist(b);
	}
	etran.commit();
	
	
}
}
