package it.team3.bw.mezzi.classi;

import javax.persistence.Entity;

@Entity
public class Tram extends Mezzo {
    public Tram(){}

    public Tram(long idMezzo, int capacita, boolean attivo, String tipologiaMezzo) {
        super(idMezzo, capacita, attivo, tipologiaMezzo);
    }
}
