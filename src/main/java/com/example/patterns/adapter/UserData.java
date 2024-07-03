package com.example.patterns.adapter;

public class UserData {
    //Attributi
    private String nomeCompleto;
    private int eta;

    //Costruttori
    public UserData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }

    //Metodi


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getEta() {
        return eta;
    }
}
