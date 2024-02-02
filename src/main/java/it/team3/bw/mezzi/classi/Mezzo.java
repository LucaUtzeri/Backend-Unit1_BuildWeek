package it.team3.bw.mezzi.classi;

import it.team3.bw.biglietto.classi.Biglietto;
import it.team3.bw.biglietto.classi.Manutenzione;
import it.team3.bw.tratta.Tratta;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "mezzi")
public abstract class Mezzo {
    @Id
    @GeneratedValue
    @Column(name = "id_mezzo")
    private long idMezzo;
    @OneToMany
    private Set<Biglietto> biglietti;
    @Column
    private int capacita;
    @Column(name = "stato_mezzo")
    private boolean attivo;

    @OneToOne(mappedBy = "mezzo")
    private Tratta tratta;

    @OneToMany(mappedBy = "mezzo")
    private Set<Manutenzione> listaManutenzioni;


    public Mezzo() {
    }

    public Mezzo(int capacita) {
        this.capacita = capacita;
        this.attivo = true;
    }

    public long getIdMezzo() {
        return idMezzo;
    }

    public void setIdMezzo(long idMezzo) {
        this.idMezzo = idMezzo;
    }

    public Set<Biglietto> getBiglietti() {
        return biglietti;
    }

    public void setBiglietti(Set<Biglietto> biglietti) {
        this.biglietti = biglietti;
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

    public Tratta getTratta() {
        return tratta;
    }

    public void setTratta(Tratta tratta) {
        this.tratta = tratta;
    }
}
