package com.multimarcas.dao;

import com.multimarcas.model.Marca;
import com.multimarcas.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author Enoque Felipe
 */
public class MarcaDao {

    public void save(Marca marca) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(marca);
        t.commit();
    }
    
        public List<Marca> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from tab_marca").list();
        t.commit();
        return lista;
    }
}
