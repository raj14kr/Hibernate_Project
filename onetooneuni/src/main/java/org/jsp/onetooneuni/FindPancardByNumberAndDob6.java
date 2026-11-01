package org.jsp.onetooneuni;
	import java.util.List;
	import java.util.Scanner;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

	public class FindPancardByNumberAndDob6 {

	    public static void main(String[] args) {

	        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

	        EntityManager em = emf.createEntityManager();

	        Scanner sc = new Scanner(System.in);


	        Query q = em.createQuery("SELECT c FROM Pancard c WHERE c.panNo = ?1 AND c.dob = ?2",Pancard.class);
	        System.out.println("Enter PAN Number =");
	        q.setParameter(1, new Scanner(System.in).next());
	        System.out.println("Enter DOB =");
	        q.setParameter(2, new Scanner(System.in).next());
	       
	        
	        try {
	        Pancard card = (Pancard) q.getSingleResult();

            System.out.println(card);

        } catch (NoResultException e) {
            System.out.println("No Result Found");

        } 

	       
	    }
}
