package test;

import bunco.RegleBunco;
import cadriciel.CollectionDes;
import cadriciel.CollectionJoueurs;
import cadriciel.Joueur;
import cadriciel.Jeu;

public class JeuMock {

    private Jeu jeu;
    private RegleBunco regle;

    public JeuMock(){

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


}
