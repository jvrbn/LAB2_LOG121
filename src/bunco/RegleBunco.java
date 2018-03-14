package bunco;

import cadriciel.*;

/**
 * Applique les règles du jeu Bunco+ à un jeu de dé.
 */
public class RegleBunco implements IStrategieRegles {

    public final static int NOMBRE_TOUR_MAX = 6;

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
        int[] de = jeu.brasserDes();
        int score = 0;

        if(de[0] == de[1] && de[0] == de[2] && de[0] == tour){

            return 21;
        }
        if(de[0] == de[1] && de[0] == de[2] && de[0] != tour){

            return 5;
        }
        else {

            if(de[0] == tour){

                score += 1;
            }
            if(de[1] == tour){

                score += 1;
            }
            if(de[2] == tour){

                score += 1;
            }

            return score;
        }
    }

    public boolean partieTerminer(Jeu jeu){

        if(jeu.getNbTours() != NOMBRE_TOUR_MAX){

            return false;
        }

        return true;
    }
}
