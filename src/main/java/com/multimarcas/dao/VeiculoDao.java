package com.multimarcas.dao;

import com.multimarcas.model.Veiculo;
import com.multimarcas.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author Enoque Felipe
 */
public class VeiculoDao {

    public void save(Veiculo veiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(veiculo);
        t.commit();
        session.close();
    }
    
     public List<Veiculo> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from tab_veiculo").list();
        t.commit();
        return lista;
    }
}
