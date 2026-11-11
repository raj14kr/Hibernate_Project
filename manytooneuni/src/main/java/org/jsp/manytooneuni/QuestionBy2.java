package org.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class QuestionBy2 {
	public static void main(String[] args) {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
	EntityManager em=emf.createEntityManager();
	Query q = em.createQuery("SELECT d FROM QuestionData d WHERE d.questionedBy = ?1");
	System.out.println("Enter QuestionBy Name:");
	q.setParameter(1, new Scanner(System.in).next());

	try {

		QuestionData d = (QuestionData) q.getSingleResult();

		System.out.println(d);

	} catch (NoResultException e) {
		System.out.println("Question By not found");

	}
}
}
