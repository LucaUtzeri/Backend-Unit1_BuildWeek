package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.Tipologia;

import javax.persistence.Entity;

@Entity
public class Distributore extends PuntoEmissione{
    public Distributore(){}

    public Distributore(String nome, boolean attivo){
        super(Tipologia.valueOf(nome), attivo);
    }
}
