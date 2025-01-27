package org.practice.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.practice.model.Todo;

import java.util.List;

public class TodoDao {

    public SessionFactory sessionFactory;

    public TodoDao() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void saveTodo(Todo todo) {
        Transaction transaction = null;

        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.persist(todo);
            transaction.commit();
        } catch (Exception e) {
            if (transaction !=null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
