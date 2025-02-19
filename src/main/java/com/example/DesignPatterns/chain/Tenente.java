package com.example.DesignPatterns.chain;

public class Tenente extends UfficialeMarina {
    public Tenente(UfficialeMarina ufficialDiRiferimento) {
        super(ufficialDiRiferimento);
    }

    public Tenente() {
    }

    @Override
    public boolean canHandle(String chore) {
        return chore.equals("lavare la sala macchine");
    }

    @Override
    public boolean salary(int salario) {
        return (salario==1000);
    }
}
