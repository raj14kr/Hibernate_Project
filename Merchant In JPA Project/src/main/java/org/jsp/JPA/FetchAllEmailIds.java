
package org.jsp.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllEmailIds {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery(
            "SELECT m.email FROM Merchant m"
        );

        List<String> e= q.getResultList();

        if (e!=null) {

            System.out.println("All Merchant Email IDs:");

            for (String e1 : e) {
                System.out.println(e1);
            }

        } else {
            System.out.println("No Email IDs Found");
        }

       
    }
}
