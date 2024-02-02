package it.team3.bw.biglietto.classi;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "punto_emissione")
public class PuntoEmissione {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_punto_emissione")
    private Long idPuntoEmissione;
    @Column
    private String nome;
    @Column
    private boolean attivo;
    @Column
    private int BigliettiRimasti;

    public PuntoEmissione(){}

    public PuntoEmissione(String nome, boolean attivo) {
        this.nome = nome;
        this.attivo = attivo;
        BigliettiRimasti = 10;
    }

    public Long getIdPuntoEmissione() {
        return idPuntoEmissione;
    }

    public void setIdPuntoEmissione(Long idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setStato(boolean attivo) {
        this.attivo = attivo;
    }

   public int getBigliettiRimasti(){
       return BigliettiRimasti;
   }

    public void setBigliettiRimasti(int bigliettiRimasti){
        this.BigliettiRimasti = bigliettiRimasti;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "idPuntoEmissione=" + idPuntoEmissione +
                ", nome='" + nome + '\'' +
                ", attivo='" + attivo + '\'' +
                ", BigliettiRimasti='" + BigliettiRimasti + '\'' +
                '}';
    }
}
