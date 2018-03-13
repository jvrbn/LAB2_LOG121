package test;

import bunco.RegleBunco;
import cadriciel.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StrategieTest {

    private Jeu jeu;
    private RegleBunco regle;

    @Before
    public void creationStrategie() {

        CollectionDes de = new CollectionDes();
        CollectionJoueurs joueur = new CollectionJoueurs();
        RegleBunco regle = new RegleBunco();
        jeu = new Jeu(de, joueur, regle);

        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur();

        joueur1.setScore(10);
        joueur2.setScore(5);
        joueur3.setScore(1);

        joueur.ajouterJoueur(joueur1);
        joueur.ajouterJoueur(joueur2);
        joueur.ajouterJoueur(joueur3);
    }

    @Test
    public void calculerVainqueur() {

        Joueur[] joueur = jeu.trieJoueurs();

        for(int i = 0; i < joueur.length - 1; i++){

            System.out.println(joueur[i]);

            assertTrue(joueur[i].compareTo(joueur[i + 1]) > 0);
        }


    }

    @Test
    public void calculerScoreTour() {



    }
}