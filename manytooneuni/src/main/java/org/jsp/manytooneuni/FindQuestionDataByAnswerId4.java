package org.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindQuestionDataByAnswerId4 {
	 public static void main(String[] args) {

	        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

	        EntityManager em = emf.createEntityManager();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter AnswerData ID:");
	        int id = sc.nextInt();

	        AnswerData ad = em.find(AnswerData.class, id);

	        if (ad != null) {
	            System.out.println(ad.getQd());
	        } else {
	            System.out.println("AnswerData not found");
	        }

	      
	    }
	}