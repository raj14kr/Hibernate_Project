
package org.jsp.JPA;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByPhone {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Phone Number:");
        Long phone = sc.nextLong();

        Query q = em.createQuery(
            "SELECT m FROM Merchant m WHERE m.phone = ?1"
        );

        q.setParameter(1, phone);

        List<Merchant> m = q.getResultList();

        if (m!=null) {

            for (Merchant m1 : m) {
                System.out.println(m1);
            }

        } else {
            System.out.println("No Record Found");
        }

       
    }
}
