package com.multimarcas.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Enoque Felipe
 */
@Entity(name = "tab_concessionaria")
public class Concessionaria implements Serializable {

	private static final long serialVersionUID = 824101681822325298L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_concessionaria;
    private String nome;

    public Long getId_concessionaria() {
        return id_concessionaria;
    }

    public void setId_concessionaria(Long id_concessionaria) {
        this.id_concessionaria = id_concessionaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
