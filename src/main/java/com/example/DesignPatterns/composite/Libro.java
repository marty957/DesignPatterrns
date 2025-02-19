package com.example.DesignPatterns.composite;

import java.util.ArrayList;
import java.util.List;
public class Libro {

private double prezzo;
private List<Autore> autori;
private List<Sezioni> capitoli;


    public Libro( double prezzo) {
        this.capitoli = new ArrayList<>();
        this.autori = new ArrayList<>();
        this.prezzo = prezzo;
    }

    public void addAutori(Autore a){
        this.autori.add(a);
    }
    public void addSezioni(Sezioni s){
        this.capitoli.add(s);

    }
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public void setAutori(List<Autore> autori) {
        this.autori = autori;
    }

    public List<Sezioni> getCapitoli() {
        return capitoli;
    }

    public void setCapitoli(List<Sezioni> capitoli) {
        this.capitoli = capitoli;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prezzo=" + prezzo +
                ", autori=" + autori +
                ", capitoli=" + capitoli +
                '}';
    }
}
