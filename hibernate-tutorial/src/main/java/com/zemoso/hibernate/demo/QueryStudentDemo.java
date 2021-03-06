package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudentDemo {

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

            // query the students
            List<Student> theStudents = session.createQuery("from Student").list();

            //display the students
            // displayStudents(theStudents);

            // query students: lastname= 'Doe'
            theStudents = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'").list();
            //displayStudents(theStudents);

            // query students where email LIKE '%zemoso.com'

            theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").list();
            displayStudents(theStudents);
            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudents) {
        for (Student student: theStudents) {
            System.out.println(student);
        }
    }

}





