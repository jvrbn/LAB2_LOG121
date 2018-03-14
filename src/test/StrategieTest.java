package test;

import bunco.RegleBunco;
import cadriciel.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StrategieTest {

    Jeu jeu;

    Joueur joueur1;
    Joueur joueur2;
    Joueur joueur3;
    Joueur joueur4;

    De de1;
    De de2;
    De de3;

    @Before
    public void initTest(){

        // Création des joueurs
        joueur1 = new Joueur();
        joueur2 = new Joueur();
        joueur3 = new Joueur();
        joueur4 = new Joueur();

        // Création de la collection
        CollectionJoueurs joueurs = new CollectionJoueurs();

        joueurs.ajouterJoueur(joueur1);
        joueurs.ajouterJoueur(joueur2);
        joueurs.ajouterJoueur(joueur3);
        joueurs.ajouterJoueur(joueur4);

        // Création des dés
        de1 = new DeMock(6);
        de2 = new DeMock(6);
        de3 = new DeMock(6);

        //Création de la collection
        CollectionDes des = new CollectionDes();

        des.ajouterDe(de1);
        des.ajouterDe(de2);
        des.ajouterDe(de3);

        //Création du jeu
        jeu = new Jeu(des,joueurs,new RegleBunco());
    }

    @Test
    public void calculerVainqueur() {

        //L'ordre devrait etre 4,2,1,3
        joueur1.setScore(10);
        joueur2.setScore(26);
        joueur3.setScore(1);
        joueur4.setScore(80);


        Joueur[] joueursVainqueur = jeu.calculerVainqueur();

        assertTrue(joueursVainqueur[0] == joueur4);
        assertTrue(joueursVainqueur[1] == joueur2);
        assertTrue(joueursVainqueur[2] == joueur1);
        assertTrue(joueursVainqueur[3] == joueur3);

        //L'ordre devrait etre 1,2,4,3
        joueur1.setScore(30);
        joueur2.setScore(15);
        joueur3.setScore(1);
        joueur4.setScore(10);

        joueursVainqueur = jeu.calculerVainqueur();

        assertTrue(joueursVainqueur[0] == joueur1);
        assertTrue(joueursVainqueur[1] == joueur2);
        assertTrue(joueursVainqueur[2] == joueur4);
        assertTrue(joueursVainqueur[3] == joueur3);
    }

    @Test
    public void calculerScoreTour() {

        //3 Chiffres identique au numéro de tour
        jeu.setNbTours(6);

        assertTrue(jeu.calculerScoreTour() == 21);

        //3 chiffres différent au numéro de tour
        jeu.setNbTours(1);

        assertTrue(jeu.calculerScoreTour() == 5);

        //1 dé identique au numéro de tour
        ((DeMock)de1).setResultat(1);

        assertTrue(jeu.calculerScoreTour() == 1);

        //2 dés identiques au numéro de tour
        ((DeMock)de2).setResultat(1);

        assertTrue(jeu.calculerScoreTour() == 2);

        //2 dés identiques au numéro de tour, mais pas le premier et le deuxième
        ((DeMock)de2).setResultat(4);
        ((DeMock)de3).setResultat(1);

        assertTrue(jeu.calculerScoreTour() == 2);

        //Aucun dés identique au numéro de tour
        ((DeMock)de1).setResultat(3);
        ((DeMock)de2).setResultat(4);
        ((DeMock)de3).setResultat(5);

        assertTrue(jeu.calculerScoreTour() == 0);
    }
}