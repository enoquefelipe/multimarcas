package com.multimarcas.controller;

import com.multimarcas.dao.EnderecoDao;
import com.multimarcas.model.Endereco;
import com.multimarcas.service.CepWebService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EnderecoBean {

    private Endereco endereco;

    public String preparaAddEndereco() {
        endereco = new Endereco();
        return "addEndereco";
    }

    public String addEndereco() throws Exception {
        EnderecoDao marcaDAO = new EnderecoDao();
        marcaDAO.save(endereco);
        return "index";
    }

    public void buscaCEP() {
        CepWebService web = new CepWebService(endereco.getCep());
        endereco.setCidade(web.getCidade());
        endereco.setEstado(web.getEstado());
        endereco.setBairro(web.getBairro());
        endereco.setLogradouro(web.getLogradouro());
        System.out.println(endereco.getLogradouro());
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
