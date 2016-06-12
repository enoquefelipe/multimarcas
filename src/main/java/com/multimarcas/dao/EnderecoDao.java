package com.multimarcas.dao;

import com.multimarcas.model.Endereco;
import com.multimarcas.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author Enoque Felipe
 */
public class EnderecoDao {

    public void save(Endereco endereco) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(endereco);
        t.commit();
    }
}
