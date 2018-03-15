/******************************************************
 Cours:   LOG121
 Session: A2013
 Groupe:  01
 Projet: Laboratoire #2
 Étudiant(e)s:
 Julien Audet
 Javier Beltran
 Philippe Paquette
 Napoleon Echeverria

 Professeur : Francis Cardinal
 Nom du fichier: PartieBunco.java
 Date créé: 2018-03-01
 Date dern. modif. 2018-03-14
 *******************************************************
 Historique des modifications
 *******************************************************
 2018-03-14 Finalisation de PartieBunco
 *******************************************************/

package bunco;

import cadriciel.*;

import java.util.Iterator;

/**
 * Une partie de jeu Bunco+
 */
public class PartieBunco implements IPartie {

    Joueur joueurActuel;
    Iterator<Joueur> iteratorJoueur;

    Jeu jeu;

    public  PartieBunco(FabriqueJeu fabrique){
        jeu = (fabrique.fabriquerJeu(4,3,6,new RegleBunco()));
        iteratorJoueur = jeu.getIteratorJoueur();
        changerJoueur();
    }


    /**
     * Permet de jouer un tour pour le joueur actuel.
     * @return Si il doit passer la main ou non.
     */
    public boolean jouerTour(){

        int score = jeu.calculerScoreTour();

        joueurActuel.setScore(joueurActuel.getScore() + score);

        return score == 21 || score == 0;
    }

    /**
     * Passe au prochain joueur.
     * @return Faux si c'est le dernier joueur.
     */
    public boolean changerJoueur(){

        if(!iteratorJoueur.hasNext())
            return false;

        joueurActuel = iteratorJoueur.next();
        return iteratorJoueur.hasNext();
    }

    /**
     * Change le tour de jeu.
     * @return Vrai si c'est le dernier tour de jeu.
     */
    public boolean changerTour(){
        jeu.setNbTours(jeu.getNbTours() + 1);

        //On retourne au premier joueur.
        iteratorJoueur = jeu.getIteratorJoueur();
        changerJoueur();

        return jeu.partieTerminer();
    }

    /**
     * Obtien le classement des joueurs.
     * @return Les joueurs en ordre décroissement.
     */
    public Joueur[] obtenirClassement(){
        return jeu.calculerVainqueur();
    }
}
