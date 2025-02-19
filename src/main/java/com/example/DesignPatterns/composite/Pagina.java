package com.example.DesignPatterns.composite;

public class Pagina {

    private String Contenuto;
    private int numeroPagina;

    public Pagina(String contenuto, int numeroPagina) {
        Contenuto = contenuto;
        this.numeroPagina = numeroPagina;
    }

    public String getContenuto() {
        return Contenuto;
    }

    public void setContenuto(String contenuto) {
        Contenuto = contenuto;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "Contenuto='" + Contenuto + '\'' +
                ", numeroPagina=" + numeroPagina +
                '}';
    }
}
