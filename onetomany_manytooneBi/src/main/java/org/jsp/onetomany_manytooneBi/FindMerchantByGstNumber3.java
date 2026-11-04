
package org.jsp.onetomany_manytooneBi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

public class FindMerchantByGstNumber3 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GST Number:");
        String gst = sc.nextLine();

        Query q = em.createQuery("SELECT m FROM Merchant m WHERE m.gst_num = ?1");

        q.setParameter(1, gst);

        try {
            Merchant m = (Merchant) q.getSingleResult();

            System.out.println(m);

        } catch (NoResultException e) {
            System.out.println("Merchant not found");

        } 
    }
}
