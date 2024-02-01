package it.team3.bw.biglietto.classi;

import javax.persistence.Entity;

@Entity
public class Distributore extends PuntoEmissione {

    public Distributore(){}

    public Distributore(String nome, boolean attivo){
        super(attivo);
    }
}