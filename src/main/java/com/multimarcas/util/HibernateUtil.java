package com.multimarcas.util;

import com.multimarcas.model.Concessionaria;
import com.multimarcas.model.Contato;
import com.multimarcas.model.Endereco;
import com.multimarcas.model.Marca;
import com.multimarcas.model.Pessoa;
import com.multimarcas.model.Veiculo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * 
 * @author Enoque Felipe
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Pessoa.class);
                ac.addAnnotatedClass(Marca.class);
                ac.addAnnotatedClass(Concessionaria.class);
                ac.addAnnotatedClass(Endereco.class);
                ac.addAnnotatedClass(Veiculo.class);
                ac.addAnnotatedClass(Contato.class);
                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }

}
