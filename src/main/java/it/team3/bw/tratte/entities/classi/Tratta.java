package it.team3.bw.tratte.entities.classi;

public class Tratta {
    private int idTratta;
    private String partenza;
    private String capolinea;
    private Double mediaPercorso;


    public Tratta(){}

    public Tratta(int idTratta, String partenza, String capolinea, Double mediaPercorso) {
        this.idTratta = idTratta;
        this.partenza = partenza;
        this.capolinea = capolinea;
        this.mediaPercorso = mediaPercorso;
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
}
