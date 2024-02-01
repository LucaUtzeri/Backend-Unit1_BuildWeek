package it.team3.bw.tratta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Tratta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTratta;

    private String puntoPartenza;
    private String capolinea;

    public Tratta(){}

    public Tratta(String puntoPartenza, String capolinea){
        this.puntoPartenza = puntoPartenza;
        this.capolinea = capolinea;
    }

    public long getIdTratta(){
        return idTratta;
    }

    public void setIdTratta( long idTratta){
        this.idTratta = idTratta;
    }

    public String getPuntoPartenza(){
        return puntoPartenza;
    }

    public void setPuntoPartenza(String puntoPartenza){
        this.puntoPartenza  = puntoPartenza;
    }

    public String getCapolinea(){
        return capolinea;
    }

    public void setCapolinea(String capolinea){
        this.capolinea = capolinea;
    }
}

