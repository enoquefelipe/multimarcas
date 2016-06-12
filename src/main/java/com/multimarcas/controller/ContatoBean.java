
package com.multimarcas.controller;

import com.multimarcas.model.Contato;
import javax.faces.bean.ManagedBean;

/**
 * 
 * @author Enoque Felipe
 */
@ManagedBean
public class ContatoBean {
    
    private Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    
    
}
