package com.example.DesignPatterns.chain;

public class Maggiore extends UfficialeMarina{
    public Maggiore(UfficialeMarina ufficialDiRiferimento) {
        super(ufficialDiRiferimento);
    }

    @Override
    public boolean canHandle(String chore) {
        return chore.equals("controllo ponte di comando");
    }

    @Override
    public boolean salary(int salario) {
        return salario==3000;
    }
}
