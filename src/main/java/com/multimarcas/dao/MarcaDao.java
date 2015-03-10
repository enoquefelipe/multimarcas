package com.multimarcas.dao;

import com.multimarcas.model.Marca;
import com.multimarcas.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MarcaDao {

    public void save(Marca marca) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(marca);
        t.commit();
    }
}
