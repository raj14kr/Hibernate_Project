package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStudentByPhone11 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Phone:");
        long phone = sc.nextLong();

        Query q = em.createQuery("SELECT s FROM Student s WHERE s.phone = ?1");

        q.setParameter(1, phone);

        List<Student> list = q.getResultList();

        if (list.size() > 0) {
            for (Student s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("Student not found");
        }

    }
}