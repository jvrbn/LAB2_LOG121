package bunco;

import cadriciel.*;

/**
 * Applique les règles du jeu Bunco+ à un jeu de dé.
 */
public class RegleBunco implements IStrategieRegles {

    /**
     * Organise les joueurs en ordre décroissant de score pour trouver le gagnant.
     * @param jeu Le jeu de dé
     * @return Une liste de joueurs en ordre décroissant du gagnant au perdant.
     */
    public Joueur[] calculerVainqueur(Jeu jeu){

        return null; // TODO
    }

    /**
     * Calcule le score d'un tour pour un joueur.
     * @param jeu Le jeu de dé
     * @return Si oui ou non il faut passer la main au prochain joueur.
     */
    public boolean calculerScoreTour(Jeu jeu){



        return true; //TODO
    }
}
