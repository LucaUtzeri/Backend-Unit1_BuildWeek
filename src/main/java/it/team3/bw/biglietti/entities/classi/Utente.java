package it.team3.bw.biglietti.entities.classi;

import java.util.Date;

public class Utente extends Tessera {
    private int idUtente;
    private String nome;
    private String cognome;
    private Date dataNascita;
    private int idTessera;

    public Utente(){}

    public Utente(int idUtente, String nome, String cognome, Date dataNascita, int idTessera) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.idTessera = idTessera;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public int getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(int idTessera) {
        this.idTessera = idTessera;
    }
}
