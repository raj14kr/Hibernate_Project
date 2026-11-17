package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStudentsBySubjectAndBatchCode18 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject:");
        String subject = sc.nextLine();

        System.out.println("Enter Batch Code:");
        String code = sc.nextLine();

        Query q = em.createQuery("SELECT s FROM Batch b JOIN b.students s WHERE b.subject = ?1 AND b.batch_code = ?2");

        q.setParameter(1, subject);
        q.setParameter(2, code);

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