package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteStudentDemo {

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

            int studentId = 6;

//            Student myStudent = session.get(Student.class, studentId);

            //delete the student
//            System.out.println("Deleting Student: " + myStudent);
//            session.delete(myStudent);

            //delete student where lastName='Daffy'
            System.out.println("Deleting student firstName=Daffy");
            session.createQuery("delete from Student where firstName='Daffy'")
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





