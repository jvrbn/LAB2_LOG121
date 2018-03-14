package bunco;

import cadriciel.*;

import java.util.Iterator;

/**
 * Une partie de jeu Bunco+
 */
public class PartieBunco implements IPartie {

    /**
     * Permet de joueur une partie complète de Bunco+
     */
    public void jouer(){

        // Nous créons notre jeu de bunco+ 4 joueurs, 3 dés à 6 faces.
        Jeu jeu = (new FabriqueJeu().fabriquerJeu(4,3,6,new RegleBunco()));

        Iterator<Joueur> joueurs = jeu.getIteratorJoueur();

        // Pendant 6 tours
        for(int i = 0; i < 6; ++i) {

            // On assigne le tour actuel au jeu.
            jeu.setNbTours(i + 1);

            // Pour chaque joueur
            while (joueurs.hasNext()) {

                Joueur joueur = joueurs.next();

                int score;

                // Tant que notre joueur ne gagne pas un bunco ou ne gagne aucun point.
                do {
                    score = jeu.calculerScoreTour();

                    joueur.setScore(joueur.getScore() + score);
                } while(score != 21 && score != 0 );
            }
        }
    }

    public boolean changerJoueur(int score){

        if(score == 0 || score == 21){

            return true;
        }
        else{

            return false;
        }
    }

}
