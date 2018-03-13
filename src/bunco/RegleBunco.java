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
     * Calcule le score d'un tour pour un joueur.
     * @param jeu Le jeu de dé
     * @return Si oui ou non il faut passer la main au prochain joueur.
     */
    public boolean calculerScoreTour(Jeu jeu){

        int[] resultats = jeu.brasserDes();




        return true; //TODO
    }
}
