package org.example;

import org.example.Entity.Student;
import org.example.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student("S002","Kamal");

        session.persist(student);

        transaction.commit();
        session.close();
    }
}