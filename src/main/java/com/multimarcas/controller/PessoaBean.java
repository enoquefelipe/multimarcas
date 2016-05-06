package com.multimarcas.controller;

import com.multimarcas.dao.PessoaDao;
import com.multimarcas.model.Contato;
import com.multimarcas.model.Endereco;
import com.multimarcas.model.Pessoa;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class PessoaBean {

    private Pessoa pessoa;
    private Endereco endereco;
    private Contato contato;
    private DataModel listaPessoas;
//  private String data;
//  private Date dt;

    public String cadastrarPessoa() throws Exception {
//      DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//      dt = (Date) (java.util.Date) formatter.parse(data);
//      pessoa.setData_nasc(dt);
        PessoaDao dao = new PessoaDao();
        pessoa.setContato(contato);
        pessoa.setEndereco(endereco);
        dao.save(pessoa);
        FacesMessage msg = new FacesMessage("Registro salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return "listaPessoas";
    }

    public DataModel listarPessoas() {
        List<Pessoa> lista = new PessoaDao().list();
        listaPessoas = new ListDataModel(lista);
        return listaPessoas;
    }

    public String preparaCadastrarPessoa() {
        pessoa = new Pessoa();
        endereco = new Endereco();
        contato = new Contato();
        return "addPessoa";
    }

    public String preparaEditarPessoa() {
        pessoa = (Pessoa) (listaPessoas.getRowData());
        System.out.println(pessoa.getNome());
        return "editar-pessoa";
    }

    public void excluirPessoa() {
        Pessoa pessoaTemp = (Pessoa) (listaPessoas.getRowData());
        PessoaDao dao = new PessoaDao();
        dao.remove(pessoaTemp);
        FacesMessage msg = new FacesMessage("Registro removido com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        listarPessoas();
    }

    public String atualizarPessoa() {
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
