package it.team3.bw.mezzi.classi;

import javax.persistence.Entity;

@Entity
public class Tram extends Mezzo {
    public Tram(){}

    public Tram(int capacita) {
        super(130);
    }
}
