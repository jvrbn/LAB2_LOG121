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
 Nom du fichier: IStrategieRegles.java
 Date créé: 2018-03-01
 Date dern. modif. 2018-03-14
 *******************************************************
 Historique des modifications
 *******************************************************
 2018-03-14 Finalisation de IStrategieRegles
 *******************************************************/

package cadriciel;

public interface IStrategieRegles{

    Joueur[] calculerVainqueur(Jeu jeu);

    int calculerScoreTour(Jeu jeu);

    boolean partieTerminer(Jeu jeu);
}