package com.multimarcas.test;

public class BuscaCEP {

    public static void main(String[] args) {

        CepWebService web = new CepWebService("04865-060");

        System.out.println(web.getCidade());
        System.out.println(web.getEstado());
        System.out.println(web.getBairro());
        System.out.println(web.getLogradouro());
    }

}
