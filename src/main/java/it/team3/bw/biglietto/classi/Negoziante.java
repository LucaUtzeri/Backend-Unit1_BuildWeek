package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.Tipologia;

import javax.persistence.Entity;

@Entity
public class Negoziante extends PuntoEmissione{

    public Negoziante(){}

    public Negoziante(String nome, Tipologia tipologia, boolean attivo) {
        super(nome, tipologia, attivo);
    }
}
