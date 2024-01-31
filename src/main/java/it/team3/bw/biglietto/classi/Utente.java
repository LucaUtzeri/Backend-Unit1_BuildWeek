package it.team3.bw.biglietto.classi;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "utenti")
public class Utente {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_utente")
    private Long idUtente;
    @Column (name = "nome_utente")
    private String nomeUtente;
    @Column (name = "cognome_utente")
    private String cognomeUtente;
    @Column
    private String documento;


    public Utente(String nomeUtente, String cognomeUtente, String documento) {
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
        this.documento = documento;
    }

    public Long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Long idUtente) {
        this.idUtente = idUtente;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
