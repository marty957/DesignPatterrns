package com.example.DesignPatterns.chain;

public class Generale extends UfficialeMarina{
    public Generale(UfficialeMarina ufficialDiRiferimento) {
        super(ufficialDiRiferimento);
    }

    @Override
    public boolean canHandle(String chore) {
        return chore.equals("controllo flotta");
    }

    @Override
    public boolean salary(int salario) {
        return salario==5000;
    }
}
