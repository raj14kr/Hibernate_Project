package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStudentsByName6 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        Query q = em.createQuery("SELECT s FROM Student s WHERE s.name = ?1");

        q.setParameter(1, name);

        List<Student> list = q.getResultList();

        if (list.size() > 0) {
            for (Student s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("Student Name not found");
        }

    }
}