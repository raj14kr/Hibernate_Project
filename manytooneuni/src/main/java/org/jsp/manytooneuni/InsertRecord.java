package org.jsp.manytooneuni;

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
		QuestionData qd=new QuestionData();
		qd.setQuestion("Who is Your Favourite Crickter:");
		qd.setQuestionedBy("Mayank");
		
		AnswerData a1=new AnswerData();
		a1.setAnswer("Virat");
		a1.setAnswerBy("Raj");
		a1.setQd(qd);
		
		AnswerData a2=new AnswerData();
		a2.setAnswer("MSD");
		a2.setAnswerBy("Lala");
		a2.setQd(qd);
		
		AnswerData a3=new AnswerData();
		a3.setAnswer("Shubham");
		a3.setAnswerBy("Aman");
		a3.setQd(qd);
		
		AnswerData a4=new AnswerData();
		a4.setAnswer("Rohit");
		a4.setAnswerBy("Sajjan");
		a4.setQd(qd);
		
		AnswerData a5=new AnswerData();
		a5.setAnswer("ABD");
		a5.setAnswerBy("Sahil");
		a5.setQd(qd);
		

		AnswerData a6=new AnswerData();
		a6.setAnswer("Maxwell");
		a6.setAnswerBy("Alok");
		a6.setQd(qd);
		
		List<AnswerData> al=Arrays.asList(a1,a2,a3,a4,a5,a6);
		for (AnswerData ad : al) {
			em.persist(ad);
		}
		etran.commit(); 
		
	}
}
