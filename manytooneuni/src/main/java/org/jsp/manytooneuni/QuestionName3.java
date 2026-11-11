package org.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QuestionName3 {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Question:");
        String question = sc.nextLine();

        Query q = em.createQuery("SELECT q FROM QuestionData q WHERE q.question = ?1");

        q.setParameter(1, question);

        List<QuestionData> list = q.getResultList();

        if (list.size() > 0) {
            for (QuestionData qd : list) {
                System.out.println(qd);
            }
        } else {
            System.out.println("QuestionData not found");
        }

	}
}
