package com.multimarcas.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 * 
 * @author Enoque Felipe
 */
@Entity(name = "tab_pessoa")
public class Pessoa implements Serializable {
//  @Temporal(TemporalType.DATE)
//  private Date data_nasc;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pessoa;
    private String nome, rg, cpf, sexo;
    private String data_nasc;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;

    public Long getId_pessoa() {
        return id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    @MapsId
    public Endereco getEndereco() {
        return endereco;
    }

      @MapsId
    public Contato getContato() {
        return contato;
    }   

    public void setId_pessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
