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
 Nom du fichier: IPartie.java
 Date créé: 2018-03-01
 Date dern. modif. 2018-03-14
 *******************************************************
 Historique des modifications
 *******************************************************
 2018-03-14 Finalisation de IPartie
 *******************************************************/

package cadriciel;

/**
 * Interface représentant une partie de jeu.
 */
public interface IPartie {
    public boolean jouerTour();
    public boolean changerJoueur();
    public boolean changerTour();
    public Joueur[] obtenirClassement();
}
