package com.example.DesignPatterns.chain;

public class Colonnello extends UfficialeMarina{
    public Colonnello(UfficialeMarina ufficialDiRiferimento) {
        super(ufficialDiRiferimento);
    }

    @Override
    public boolean canHandle(String chore) {
        return chore.equals("controllo ammiraglia");
    }

    @Override
    public boolean salary(int salario) {
        return salario<=4000;
    }
}
