package com.example.DesignPatterns.chain;

public class Capitano extends UfficialeMarina{
    public Capitano(UfficialeMarina ufficialDiRiferimento) {
        super(ufficialDiRiferimento);
    }

    @Override
    public boolean canHandle(String chore) {
        return chore.equals("controllo sala macchine livello -1 e 0");
    }

    @Override
    public boolean salary(int salario) {
        return salario==2000;
    }
}
