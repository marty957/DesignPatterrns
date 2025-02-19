package com.example.DesignPatterns.adapter;

import java.time.LocalDate;

public class UserData {

private String nomeCompleto;
private int eta;


public void getData(DataSource ds){
    nomeCompleto= ds.getNomeCompleto();
    eta=ds.getEta();
}


}
