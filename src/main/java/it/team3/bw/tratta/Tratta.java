package it.team3.bw.tratta;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table (name = "tratta")
public class Tratta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_tratta")
    private long idTratta;
    @ManyToOne
    @JoinColumn (name = "id_mezzo")
    private long idMezzo;
    @Column
    private String puntoPartenza;
    @Column
    private String capolinea;
    @Column (name = "percorrenza_media")
    private double percorrenzaMedia;
    @Column(name = "num_percorso_mezzo")
    private int numPercorsoMezzo;
    @Column(name = "tempo_percorso_mezzo")
    private int tempoPercorsoMezzo;

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

    public void calcolaPercorrenzaMedia(double distanza, double tempo){
        if( tempo != 0) {
            this.percorrenzaMedia = distanza / tempo;
        } else {
            this.percorrenzaMedia = 0;
        }
    }

    @Override
    public String toString() {
        return "Tratta{" +
                "idTratta=" + idTratta +
                ", puntoPartenza=" + puntoPartenza +
                ", capolinea=" + capolinea +
                ", percorrenzaMedia=" + percorrenzaMedia +
                ", numPercorsoMezzo='" + numPercorsoMezzo  +
                ", tempoPercorsoMezzo='" + tempoPercorsoMezzo  +
                '}';
    }
}

