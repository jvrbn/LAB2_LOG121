package test;

import bunco.RegleBunco;
import cadriciel.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StrategieTest {

    private JeuMock jeuMock;
    private CollectionJoueurs joueurs;
    private CollectionDes des;
    private Jeu jeu;
    private IStrategieRegles regle;

    @Before
    public void creationStrategie() {

        JeuMock jeuMock = new JeuMock();

        regle = new RegleBunco();
        des = new CollectionDes();
        joueurs = new CollectionJoueurs();

        //Création des joueurs
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur();
        Joueur joueur4 = new Joueur();

        //ajout des joueurs dans la collection de joueurs
        joueurs.ajouterJoueur(joueur1);
        joueurs.ajouterJoueur(joueur2);
        joueurs.ajouterJoueur(joueur3);
        joueurs.ajouterJoueur(joueur4);

        //Ajuste le score de chaque joueurs
        joueur1.setScore(3);
        joueur2.setScore(2);
        joueur3.setScore(7);
        joueur4.setScore(1);

        jeu = new Jeu(des,joueurs,regle);
    }

    @Test
    public void calculerVainqueur() {

        Joueur[] joueur = regle.calculerVainqueur(jeu);

        assertTrue(joueur[0].getScore() == 7 && joueur[1].getScore() == 3 && joueur[2].getScore() == 2 && joueur[3].getScore() == 1);

    }

    @Test
    public void calculerScoreTour() {

        int score = regle.calculerScoreTour(jeu);

        assertTrue(score <= 21 && score >= 0);

    }
}