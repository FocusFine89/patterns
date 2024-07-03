package com.example.patterns.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class UserAdapter implements DataSource{
    //Attributi
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

    //Costruttori


    public UserAdapter(String nome, String cognome, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    //Metodi
    @Override
    public String getNomeCompleto() {
        //Ritorno nome e cognome concatenati
        return this.nome + " " + this.cognome;
    }

    @Override
    public int getEta() {
       //Ottengo la data di oggi
        LocalDate dataCorrente = LocalDate.now();

        //calcolo il periodo passato tra la data di oggi e la data di nascita dell'utente
        Period anni = Period.between(this.dataDiNascita, dataCorrente);
        return anni.getYears();
    }
}
