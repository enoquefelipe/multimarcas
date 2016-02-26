package com.multimarcas.controller;

import com.multimarcas.dao.PessoaDao;
import com.multimarcas.model.Contato;
import com.multimarcas.model.Endereco;
import com.multimarcas.model.Pessoa;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class PessoaBean {

    private Pessoa pessoa;
    private Endereco endereco;
    private Contato contato;
    private DataModel listaPessoas;
//    private String data;
//    private Date dt;

    public String preparaAddPessoa() {
        pessoa = new Pessoa();
        return "addPessoa";
    }

    public String prepararAlterarPessoa() {
        pessoa = (Pessoa) (listaPessoas.getRowData());
        return "updatePessoa";
    }

    public String addPessoa() throws Exception {
//      DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//      dt = (Date) (java.util.Date) formatter.parse(data);
//      pessoa.setData_nasc(dt);
        PessoaDao pessoaDAO = new PessoaDao();
        pessoaDAO.save(pessoa);
        return "listaPessoas";
    }

    public DataModel listarPessoas() {
        List<Pessoa> lista = new PessoaDao().list();
        listaPessoas = new ListDataModel(lista);
        return listaPessoas;
    }

    public String excluirPessoa() {
        Pessoa pessoaTemp = (Pessoa) (listaPessoas.getRowData());
        PessoaDao dao = new PessoaDao();
        dao.remove(pessoaTemp);
        return "index";
    }

    public String alterarPessoa() {
        PessoaDao dao = new PessoaDao();
        dao.update(pessoa);
        return "index";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public DataModel getListaPessoas() {
        return listaPessoas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }   

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setListaPessoas(DataModel listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void setContato(Contato contato) {
        this.contato = contato;
    }    

//    public String getData() {
//        return data;
//    }
//    
//    public void setData(String data) {
//        this.data = data;
//    }

}
