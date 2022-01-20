package com.example.appcanzoni;
import java.util.Date;

public class Brano {


    private String titolo;
    private int durata;
    private String autore;
    private String datacreazione;
    private String genere;

    public Brano(String titolo, String autore, int durata, String datacreazione,String genere ) {
        this.titolo=titolo;
        this.autore=autore;
        this.durata=durata;
        this.datacreazione=datacreazione;
        this.genere=genere;
    }
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getDatacreazione() {
        return datacreazione;
    }

    public void setDatacreazione(String datacreazione) {
        this.datacreazione = datacreazione;
    }

    public String getGenere() { return genere; }

    public void setGenere(String genere) { this.genere = genere; }


}

