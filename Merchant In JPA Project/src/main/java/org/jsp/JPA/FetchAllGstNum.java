
package org.jsp.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllGstNum {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery(
            "SELECT m.gst_num FROM Merchant m"
        );

        List<String> gst = q.getResultList();

        if (gst!=null) {

            System.out.println("All Merchant GST Numbers:");

            for (String gst1 : gst) {
                System.out.println(gst1);
            }

        } else {
            System.out.println("No GST Numbers Found");
        }

      
    }
}
