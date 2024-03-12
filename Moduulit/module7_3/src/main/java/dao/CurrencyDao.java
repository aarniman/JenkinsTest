package dao;

import enitity.*;
import jakarta.persistence.EntityManager;

public class CurrencyDao {

    public void persist(Currency currency) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(int id) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        return em.find(Currency.class, id);
    }

    public void update(Currency currency) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();
    }

    public void delete(Currency currency) {
        EntityManager em = datasource.MariaDBConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();
    }

}