package dao;

import enitity.*;
import jakarta.persistence.EntityManager;

public class TransactionDao {

    public void persist(Transaction transaction) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }

    public Transaction find(int id) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        return em.find(Transaction.class, id);
    }

    public void detach(Transaction transaction) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        em.detach(transaction);
    }

}
