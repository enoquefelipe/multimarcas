package com.multimarcas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tab_marca")
public class Marca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_marca;
    private String nome;

    @OneToMany(mappedBy = "marca", targetEntity = Veiculo.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Veiculo> Veiculos;

    @Override
    public String toString() {
        return ""+nome;
    }      

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculos() {
        return Veiculos;
    }

    public void setVeiculos(List<Veiculo> Veiculos) {
        this.Veiculos = Veiculos;
    }
}
