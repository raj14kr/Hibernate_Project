package org.jsp.manytomanyuni;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStudentsByPercentageGreaterThan85_15 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT s FROM Student s WHERE s.marks > ?1");

        q.setParameter(1, 85.0);

        List<Student> list = q.getResultList();

        if (list.size() > 0) {
            for (Student s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("No students found");
        }

    }
}