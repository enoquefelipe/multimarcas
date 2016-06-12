package com.multimarcas.controller;

import com.multimarcas.dao.MarcaDao;
import com.multimarcas.model.Marca;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author Enoque Felipe
 */
@ManagedBean
@SessionScoped
public class MarcaBean {

    private Marca marca;

    public String preparaAddMarca() {
        marca = new Marca();
        return "addMarca";
    }

    public String addMarca() throws Exception {
        MarcaDao marcaDAO = new MarcaDao();
        marcaDAO.save(marca);
        return "index";
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
