package it.team3.bw.mezzi.classi;

import it.team3.bw.biglietto.classi.Biglietto;
import it.team3.bw.tratta.Tratta;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "mezzi")
public abstract class Mezzo {
    @Id
    @GeneratedValue
    @Column (name = "id_mezzo")
    private long idMezzo;
    @OneToMany
    private Set<Biglietto> biglietti;
    @Column
    private int capacita;
    @Column (name = "stato_mezzo")
    private boolean attivo;

    @OneToOne (mappedBy = "mezzo")
    private Tratta tratta;
    public Mezzo(){}

    public Mezzo(int capacita) {
        this.capacita = capacita;
        this.attivo = true;
    }

}
