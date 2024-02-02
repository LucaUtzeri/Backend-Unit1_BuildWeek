package it.team3.bw.mezzi.classi;

import it.team3.bw.biglietto.classi.Biglietto;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "mezzi")
public class Mezzo {
    @Id
    @GeneratedValue
    @Column (name = "id_mezzo")
    private long idMezzo;
    @ManyToOne
    private Biglietto biglietto;
    @Column
    private int capacita;
    @Column (name = "stato_mezzo")
    private boolean attivo;
    @Column (name = "tipologia_mezzo")
    private String tipologiaMezzo;
    public Mezzo(){}

    public Mezzo(long idMezzo, Biglietto biglietto, int capacita, boolean attivo, String tipologiaMezzo) {
        this.idMezzo = idMezzo;
        this.biglietto = biglietto;
        this.capacita = capacita;
        this.attivo = attivo;
        this.tipologiaMezzo = tipologiaMezzo;
    }

    public Mezzo(long idMezzo, int capacita, boolean attivo, String tipologiaMezzo) {
    }

    public long getIdMezzo() {
        return idMezzo;
    }

    public void setIdMezzo(long idMezzo) {
        this.idMezzo = idMezzo;
    }

    public Biglietto getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(Biglietto biglietto) {
        this.biglietto = biglietto;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public String getTipologiaMezzo() {
        return tipologiaMezzo;
    }

    public void setTipologiaMezzo(String tipologiaMezzo) {
        this.tipologiaMezzo = tipologiaMezzo;
    }

    @Override
    public String toString() {
        return "Mezzo{" +
                "idMezzo=" + idMezzo +
                ", biglietto=" + biglietto +
                ", capacita=" + capacita +
                ", attivo=" + attivo +
                ", tipologiaMezzo='" + tipologiaMezzo + '\'' +
                '}';
    }
}
