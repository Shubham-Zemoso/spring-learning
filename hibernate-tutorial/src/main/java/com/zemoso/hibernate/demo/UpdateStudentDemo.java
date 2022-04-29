package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            int studentId = 1;

            Student myStudent = session.get(Student.class, studentId);

            System.out.println(myStudent);

            myStudent.setLastName("Doo");

            System.out.println(myStudent);

            // commit transaction
            session.getTransaction().commit();

            //New Code
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Update email for all students");

            session.createQuery("update Student set email='foo@gmail.com'")
                    .executeUpdate();

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }

}





