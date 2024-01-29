package it.team3.bw.tratte.entities.classi;

import it.team3.bw.mezzi.entities.classi.Veicolo;
import it.team3.bw.mezzi.entities.enums.Tipologia;

public class Tratta extends Veicolo {
    private int idTratta;
    private String partenza;
    private String capolinea;
    private Double mediaPercorso;
    private int voltePercorso;
    public Tratta(){}

    public Tratta(long idVeicolo, Tipologia tipologia, int idTratta, String partenza, String capolinea, Double mediaPercorso, int voltePercorso) {
        super(idVeicolo, tipologia);
        this.idTratta = idTratta;
        this.partenza = partenza;
        this.capolinea = capolinea;
        this.mediaPercorso = mediaPercorso;
        this.voltePercorso = voltePercorso;
    }

    public int getIdTratta() {
        return idTratta;
    }

    public void setIdTratta(int idTratta) {
        this.idTratta = idTratta;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getCapolinea() {
        return capolinea;
    }

    public void setCapolinea(String capolinea) {
        this.capolinea = capolinea;
    }

    public Double getMediaPercorso() {
        return mediaPercorso;
    }

    public void setMediaPercorso(Double mediaPercorso) {
        this.mediaPercorso = mediaPercorso;
    }

    public int getVoltePercorso() {
        return voltePercorso;
    }

    public void setVoltePercorso(int voltePercorso) {
        this.voltePercorso = voltePercorso;
    }
}
