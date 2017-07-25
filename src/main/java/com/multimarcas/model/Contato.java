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
@Entity(name = "tab_contato")
public class Contato implements Serializable {

	private static final long serialVersionUID = -1987468269940799682L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email, site, residencial, movel, comercial, fax, obs;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }

    public String getResidencial() {
        return residencial;
    }

    public String getMovel() {
        return movel;
    }

    public String getComercial() {
        return comercial;
    }

    public String getFax() {
        return fax;
    }

    public String getObs() {
        return obs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public void setMovel(String movel) {
        this.movel = movel;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
