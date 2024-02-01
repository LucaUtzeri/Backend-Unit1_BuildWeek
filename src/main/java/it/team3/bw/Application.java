package it.team3.bw;

import com.github.javafaker.Faker;
import it.team3.bw.DAOs.AbbonamentoDAO;
import it.team3.bw.DAOs.BigliettoDAO;
import it.team3.bw.DAOs.PuntoEmissioneDAO;
import it.team3.bw.DAOs.UtenteDAO;
import it.team3.bw.biglietto.classi.Distributore;
import it.team3.bw.biglietto.classi.Negoziante;
import it.team3.bw.biglietto.classi.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Application {

    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("be-buildweek1");

    public static void main(String[] args) {

        //Instansazione DAOs + Faker
        EntityManager em = emf.createEntityManager();
        UtenteDAO ud = new UtenteDAO(em);
        PuntoEmissioneDAO peD = new PuntoEmissioneDAO();
        AbbonamentoDAO abd = new AbbonamentoDAO(em);
        BigliettoDAO bigliettoDAO = new BigliettoDAO();
        Distributore distributore = new Distributore("Distributore 1", true);
        Negoziante negoziante = new Negoziante("Negozio 1", true);
        Faker faker = new Faker();
        Scanner scanner = new Scanner(System.in);


//        //Aggiungere Nuovi User nella table
        System.out.println("Benvenuto! Cosa desideri acquistare?");
        System.out.println("1: Biglietto");
        System.out.println("2: Abbonamento");
        System.out.print("Risposta: ");
        int scelta = scanner.nextInt();
        switch (scelta){
            case 1:
                aquistaBiglietto(scanner);
                break;
            case 2 :
                aquistaAbbonamento(scanner);
                break;
            default:
                System.out.println("Questo prodotto è inesistente");
        }
        scanner.close();

        Utente utente1 = new Utente(faker.name().name(),faker.name().lastName(),documento);
        ud.saveUtente(utente1);




        em.close();
        emf.close();
    }
}
