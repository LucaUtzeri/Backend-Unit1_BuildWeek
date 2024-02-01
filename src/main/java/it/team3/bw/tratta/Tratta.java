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
    @Column
    private double percorrenzaMedia;
    @Column
    private int numPercorsoMezzo;
    @Column
    private int tempoPercorsoMezzo;

    public Tratta(){}

    public Tratta(String puntoPartenza, String capolinea, double percorrenzaMedia, int numPercorsoMezzo, int tempoPercorsoMezzo){
        this.puntoPartenza = puntoPartenza;
        this.capolinea = capolinea;
        this.percorrenzaMedia = percorrenzaMedia;
        this.numPercorsoMezzo = numPercorsoMezzo;
        this.tempoPercorsoMezzo = tempoPercorsoMezzo;
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

    public double getPercorrenzaMedia() {
        return percorrenzaMedia;
    }

    public void setPercorrenzaMedia(double percorrenzaMedia){
        this.percorrenzaMedia = percorrenzaMedia;
    }

   public int getNumPercorsoMezzo(){
        return numPercorsoMezzo;
   }

   public void setNumPercorsoMezzo(int numPercorsoMezzo){
        this.numPercorsoMezzo = numPercorsoMezzo;
   }

   public int getTempoPercorsoMezzo(){
        return tempoPercorsoMezzo;
   }

   public void setTempoPercorsoMezzo(int tempoPercorsoMezzo){
        this.tempoPercorsoMezzo = tempoPercorsoMezzo;
   }

    public void calcolaPercorrenzaMedia(double distanza, double tempo){
        if( tempo != 0) {
            this.percorrenzaMedia = distanza / tempo;
        } else {
            this.percorrenzaMedia = 0;
        }
    }

    public void aggiornaPercorrenza(int tempo, int volte){
        this.tempoPercorsoMezzo += tempo;
        this.numPercorsoMezzo += volte;
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

