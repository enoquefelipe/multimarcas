package com.multimarcas.model;

import java.io.Serializable;
//import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Temporal;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome, rg, cpf, sexo;
//    @Temporal(javax.persistence.TemporalType.DATE)
//    private Date dataNasc;

//    @Temporal(javax.persistence.TemporalType.DATE)
//    private Date dataNasc;
    public void setId(Long id) {
        this.id = id;
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

//    public void setDataNasc(Date dataNasc) {
//        this.dataNasc = dataNasc;
//    }
    public Long getId() {
        return id;
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

//    public Date getDataNasc() {
//        return dataNasc;
//    }
}
