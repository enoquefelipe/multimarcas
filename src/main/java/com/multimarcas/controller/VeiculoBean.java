package com.multimarcas.controller;

import com.multimarcas.dao.MarcaDao;
import com.multimarcas.dao.VeiculoDao;
import com.multimarcas.model.Marca;
import com.multimarcas.model.Veiculo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;

/**
 * 
 * @author Enoque Felipe
 */
@ManagedBean
@SessionScoped
public class VeiculoBean {

    private Veiculo veiculo;
    private Marca marca;
    private Long id;
    private DataModel<?> listaVeiculos;
    private List<Marca> marcas;

    public String preparaAddVeiculo() {
        veiculo = new Veiculo();
        return "addVeiculo";
    }

    public List<Marca> getMarcas() {
        MarcaDao mdao = new MarcaDao();
        marcas = mdao.list();
        return marcas;
    }

    public String addVeiculo() {
        VeiculoDao dao = new VeiculoDao();
        marca = new Marca();
        marca.setId(id);
        veiculo.setMarca(this.marca);
        dao.save(veiculo);
        return "index";
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public DataModel<?> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(DataModel<?> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Long getId_marca() {
        return id;
    }

    public void setId_marca(Long id_marca) {
        this.id = id_marca;
    }
}
