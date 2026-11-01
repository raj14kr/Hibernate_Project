package org.jsp.onetooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByNumber5 {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT c FROM Pancard c WHERE c.panNo = ?1",Pancard.class);
        System.out.println("Enter Pancard Number=");
                q.setParameter(1, new Scanner(System.in).next());
                
                	
            try {  
            	  Pancard card = (Pancard) q.getSingleResult();

                  System.out.println(card);

              } catch (NoResultException e) {
                  System.out.println("Pancard Not Found");

              } 
       

    }
}
