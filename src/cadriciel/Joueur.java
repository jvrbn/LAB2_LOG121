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
 Nom du fichier: Joueur.java
 Date créé: 2018-03-01
 Date dern. modif. 2018-03-14
 *******************************************************
 Historique des modifications
 *******************************************************
 2018-03-14 Finalisation de Joueur
 *******************************************************/

package cadriciel;

/**
 * Classe représentant un joueur. Permet de gérer son score.
 */
public class Joueur implements Comparable<Joueur>{

    private int score = 0;

    public int getScore(){
        return score;
    }

    public void setScore(int valeur){
        score = valeur;
    }

    /**
     * Compare deux joueurs en utilisant leur score. Negatif implique que le joueur possède un
     * score moins haut que l'autre joueur.
     * @param autreJoueur Le joueur à être comparé.
     * @return Une valeur indiquant si le joueur possède un plus haut ou plus bas score.
     */
    public int compareTo(Joueur autreJoueur) {
        return score - autreJoueur.score;
    }
}
