package bunco;

import cadriciel.*;

/**
 * Applique les règles du jeu Bunco+ à un jeu de dé.
 */
public class RegleBunco implements IStrategieRegles {

    private Joueur[] joueurs;
    /**
     * Organise les joueurs en ordre décroissant de score pour trouver le gagnant.
     * @param jeu Le jeu de dé
     * @return Une liste de joueurs en ordre décroissant du gagnant au perdant.
     *
     * Souruce : https://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
     */
    public Joueur[] calculerVainqueur(Jeu jeu){

        joueurs = jeu.trieJoueurs();

        for(int i = 0; i<joueurs.length/2; i++){
            Joueur temp = joueurs[i];
            joueurs[i] = joueurs[joueurs.length - i - 1];
            joueurs[joueurs.length - i - 1] = temp;
        }

        return joueurs;
    }

    /**
     * Calcule le score d'un LANCER pour un joueur.
     * @param jeu Le jeu de dé
     * @return Si oui ou non il faut passer la main au prochain joueur.
     */
    public int calculerScoreTour(Jeu jeu){

        int tour = jeu.getNbTours();
        int de1 = jeu.brasserDes()[0];
        int de2 = jeu.brasserDes()[1];
        int de3 = jeu.brasserDes()[2];
        int score = 0;

        if(de1 == de2 && de1 == de3 && de1 == tour){

            return 21;
        }
        if(de1 == de2 && de1 == de3 && de1 != tour){

            return 5;
        }
        else {

            if(de1 == tour){

                score += 1;
            }
            if(de2 == tour){

                score += 1;
            }
            if(de3 == tour){

                score += 1;
            }

            return score;
        }
    }
}
