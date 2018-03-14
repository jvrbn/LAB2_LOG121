package test;

import bunco.RegleBunco;
import cadriciel.*;
import org.junit.*;
import static org.junit.Assert.*;

public class JeuTest{

    private Jeu jeu;
    private CollectionJoueurs joueurs;
    private CollectionDes des;
    private int nbFaces = 6;

    @Before
    public void creationJeu(){

        des = new CollectionDes();
        joueurs = new CollectionJoueurs();
        RegleBunco regle = new RegleBunco();

        //Ajout des dés dans la collection de dés
        des = new CollectionDes();
        des.ajouterDe(new De(nbFaces));
        des.ajouterDe(new De(nbFaces));
        des.ajouterDe(new De(nbFaces));

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

    //Test du getter du nombre de face
    @Test
    public void getterNbToursTest(){

        jeu.getNbTours();
        assertTrue(jeu.getNbTours() == 1);
    }

    //Test du setter du nombre de face
    @Test
    public void SetterNbToursTest(){

        jeu.setNbTours(3);
        assertTrue(jeu.getNbTours() == 3);;
    }

    //Test de la méthode brasserDes
    @Test
    public void brasserDesTest(){

        int[] deBrasser = des.brasserDes();

        //Parcourt le tableau de dé et s'assurer que le dé est brasser entre le nombre de faces et 0
        for(int i = 0; i<deBrasser.length-1; i++){
            assertTrue(deBrasser[i] <= nbFaces && deBrasser[i] > 0);
        }
    }

    //Test de la méthode de trie des joueurs en fonction de leurs score
    @Test
    public void trieJoueursTest(){

        Joueur[] joueur = joueurs.trier();

        assertTrue(joueur[0].getScore() == 1 && joueur[1].getScore() == 2 && joueur[2].getScore() == 3 && joueur[3].getScore() == 7);
    }
}