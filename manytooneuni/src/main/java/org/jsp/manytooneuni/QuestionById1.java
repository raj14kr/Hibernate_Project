package org.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QuestionById1 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
		EntityManager em=emf.createEntityManager();

        System.out.println("Enter Question Id:");

        QuestionData d = em.find(QuestionData.class, new Scanner(System.in).nextInt());

        if (d != null) {
            System.out.println(d);         
        } else {
            System.out.println("Question not found");
        }

      
    }
	
	
}
