package com.example.DesignPatterns.chain;

 abstract public class UfficialeMarina {
    private UfficialeMarina ufficialDiRiferimento;

    public UfficialeMarina(UfficialeMarina ufficialDiRiferimento) {
        this.ufficialDiRiferimento = ufficialDiRiferimento;
    }

     public UfficialeMarina() {
     }

     public UfficialeMarina getUfficialDiRiferimento() {
         return ufficialDiRiferimento;
     }

     public void setUfficialDiRiferimento(UfficialeMarina ufficialDiRiferimento) {
         this.ufficialDiRiferimento = ufficialDiRiferimento;
     }

     public void salarioDistrubuzione(int salario){
        if(salary(salario)){
            System.out.println("con il salario segnalato la posizione di riferimento è "
                    + this.getClass().getSimpleName());
        } else if(ufficialDiRiferimento != null){
            ufficialDiRiferimento.salarioDistrubuzione(salario);
        }else{
            System.out.println("salario non presente nei nostri range");
        }

    }

     @Override
     public String toString() {
         return "UfficialeMarina{" +
                 "ufficialDiRiferimento=" + ufficialDiRiferimento +
                 '}';
     }

     public abstract boolean canHandle(String chore);
    public abstract boolean salary(int salario);
}
