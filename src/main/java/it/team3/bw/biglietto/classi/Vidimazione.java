package it.team3.bw.biglietto.classi;

import it.team3.bw.mezzi.classi.Mezzo;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@Table (name = "vidimazioni")
public class Vidimazione {
    @Id
    @GeneratedValue
    @Column (name = "id_vidimazione")
    private long idVidimazione;
    @OneToOne
    private Biglietto biglietto;
    @OneToOne
    private Mezzo mezzo;
    @Column (name = "data_vidimazione")
    private LocalDate dataVidimazione;
    @Column
    private boolean stato;

    public Vidimazione(Biglietto biglietto, Mezzo mezzo, LocalDate dataVidimazione, boolean stato) {
        this.biglietto = biglietto;
        this.mezzo = mezzo;
        this.dataVidimazione = dataVidimazione;
        this.stato = stato;

    }

    public long getIdVidimazione() {
        return idVidimazione;
    }

    public void setIdVidimazione(long idVidimazione) {
        this.idVidimazione = idVidimazione;
    }

    public Biglietto getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(Biglietto biglietto) {
        this.biglietto = biglietto;
    }

    public Mezzo getMezzo() {
        return mezzo;
    }

    public void setMezzo(Mezzo mezzo) {
        this.mezzo = mezzo;
    }

    public LocalDate getDataVidimazione() {
        return dataVidimazione;
    }

    public void setDataVidimazione(LocalDate dataVidimazione) {
        this.dataVidimazione = dataVidimazione;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Vidimazione{" +
                "idVidimazione=" + idVidimazione +
                ", biglietto=" + biglietto +
                ", mezzo=" + mezzo +
                ", dataVidimazione=" + dataVidimazione +
                ", stato=" + stato +
                '}';
    }
}
