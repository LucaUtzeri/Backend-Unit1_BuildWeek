package it.team3.bw.biglietto.classi;

import javax.persistence.Entity;

@Entity
public class Negoziante extends PuntoEmissione{

    public Negoziante(){}

    public Negoziante(String nome,  boolean attivo) {
        super(nome, attivo);
    }
}
