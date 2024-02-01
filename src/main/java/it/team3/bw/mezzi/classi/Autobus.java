package it.team3.bw.mezzi.classi;

import javax.persistence.Entity;

@Entity
public class Autobus extends Mezzo{
    public Autobus(){}

    public Autobus(long idMezzo, int capacita, boolean attivo, String tipologiaMezzo) {
        super(idMezzo, capacita, attivo, tipologiaMezzo);
    }
}
