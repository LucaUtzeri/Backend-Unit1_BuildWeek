package it.team3.bw;

import com.github.javafaker.Faker;
import it.team3.bw.DAOs.UtenteDAO;
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
        Faker faker = new Faker();
        Scanner scanner = new Scanner(System.in);


//        //Aggiungere Nuovi User nella table
        System.out.println("Scegli che documento vuoi: Abbonamento o Biglietto (A/B)");
        String documento = scanner.nextLine();
        if (documento == "A"){
        System.out.println("Creazione Abbonamento...");
        }
//        else if (documento == "Biglietto"){
//            System.out.println("Stampa Biglietto...");
//        };
        Utente utente1 = new Utente(faker.name().name(),faker.name().lastName(),documento);
        ud.saveUtente(utente1);
    }
}
