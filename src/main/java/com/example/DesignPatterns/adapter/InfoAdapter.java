package com.example.DesignPatterns.adapter;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource{

    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

   @Override
    public String getNomeCompleto(){
       return info.getNome()+" "+ info.getCognome();
   }
    @Override
    public int getEta() {
        LocalDate data= info.getDataDiNascita();
        if(data!=null){
          return Period.between(data,LocalDate.now()).getYears();
        }
        else{
            return 404;
        }

    }

}
