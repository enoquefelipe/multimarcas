package com.multimarcas.util;

import com.multimarcas.dao.MarcaDao;
import com.multimarcas.dao.VeiculoDao;
import com.multimarcas.model.Marca;
import com.multimarcas.model.Pessoa;
import com.multimarcas.model.Veiculo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * 
 * @author Enoque Felipe
 */
public class Test {

    static Pessoa pessoa;

    public static void main(String[] args) {

        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

//        pessoa = new Pessoa();
//        pessoa.setNome("Enoque");
//        pessoa.setCpf("397.334.938-05");
//        pessoa.setRg("0000");
//        pessoa.setSexo("Masculino");
//
//        Transaction tx = session.beginTransaction();
//        session.save(pessoa);
//        tx.commit();
        Marca marca = new Marca();
        marca.setNome("GM");

        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();

        veiculo1.setModelo("Celta");
        veiculo1.setCategoria("Hatch");
        veiculo1.setAno("2014");
        veiculo1.setMotor("1.4");
        veiculo1.setPreco("30.000");

        veiculo2.setModelo("Classic");
        veiculo2.setCategoria("Sedan");
        veiculo2.setAno("2014");
        veiculo2.setMotor("1.6");
        veiculo2.setPreco("30.000");

        // has-an associando o jogador ao team
        veiculo1.setMarca(marca);
        veiculo2.setMarca(marca);

        MarcaDao mdao = new MarcaDao();
        mdao.save(marca);

        VeiculoDao vdao = new VeiculoDao();
        vdao.save(veiculo1);
        vdao.save(veiculo2);
    }

}
