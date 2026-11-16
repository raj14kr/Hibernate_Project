package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStudentsByBatchCode10 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Batch Code:");
        String code = sc.nextLine();

        Query q = em.createQuery("SELECT s FROM Batch b JOIN b.students s WHERE b.batch_code = ?1");

        q.setParameter(1, code);

        List<Student> list = q.getResultList();

        if (list.size() > 0) {
            for (Student s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("No students found for this batch");
        }

    }
}