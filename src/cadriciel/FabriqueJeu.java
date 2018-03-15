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
 Nom du fichier: FabriqueJeu.java
 Date créé: 2018-03-01
 Date dern. modif. 2018-03-14
 *******************************************************
 Historique des modifications
 *******************************************************
 2018-03-14 Finalisation de FabriqueJeu
 *******************************************************/

package cadriciel;

/**
 * Une classe abstraite de fabrique permetant de faire des instances de jeux.
 */
public class FabriqueJeu {

    protected int nbJoueurs = 0;
    protected int nbDes = 0;
    protected int nbFaces = 0;

    public Jeu fabriquerJeu(int nbJoueurs, int nbDes, int nbFaces, IStrategieRegles regles){

        if(nbJoueurs < 1)
            throw new IllegalArgumentException("Il doit y avoir au moins un joueur.");

        if(nbDes < 1)
            throw new IllegalArgumentException("Il doit y avoir au moins un dé.");

        if(nbFaces < 2)
            throw new IllegalArgumentException("Il doit y avoir au moins deux faces pour les dés.");

        this.nbJoueurs = nbJoueurs;
        this.nbDes = nbDes;
        this.nbFaces = nbFaces;

        return new Jeu(fabriquerDes(), fabriquerJoueurs(), regles);
    }

    protected CollectionDes fabriquerDes() {

        CollectionDes des = new CollectionDes();

        for(int i = 0; i < nbDes; i++){
            des.ajouterDe(new De(nbFaces));
        }

        return des;
    }

    protected CollectionJoueurs fabriquerJoueurs() {

        CollectionJoueurs joueurs = new CollectionJoueurs();

        for(int i = 0; i < nbJoueurs; ++i){
            joueurs.ajouterJoueur(new Joueur());
        }

        return joueurs;
    }
}
