package com.example.DesignPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezioni {
    private List<Pagina> capitoli;



    public Sezioni() {
        capitoli=new ArrayList<>();
    }

    public List<Pagina> getCapitoli() {
        return capitoli;
    }


public void addPagine(Pagina p){
       capitoli.add(p);
}
    @Override
    public String toString() {
        return "Sezioni{" +
                "capitoli=" + capitoli +
                '}';
    }
}
