package it.team3.bw.mezzi.classi;

import javax.persistence.Entity;

@Entity
public class Autobus extends Mezzo{
    public Autobus(){}

    public Autobus(int capacita) {
        super(50);
    }
}
