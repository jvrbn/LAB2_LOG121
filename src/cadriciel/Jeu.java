package cadriciel;

import java.util.Iterator;

public class Jeu {

    private int nbTours = 1;
    private CollectionDes des;
    private CollectionJoueurs joueurs;
    private IStrategieRegles regles;


    public Jeu(CollectionDes des, CollectionJoueurs joueurs, IStrategieRegles regles) {

        this.des = des;
        this.joueurs = joueurs;
        this.regles = regles;
    }

    public int calculerScoreTour(){
        return regles.calculerScoreTour(this);
    }

    public Joueur[] calculerVainqueur(){
        return regles.calculerVainqueur(this);
    }

    /**
     * Brasse tout les dés du jeu et retourne leur résultats.
     * @return Tableau contenant les résultats des dés.
     */
    public int[] brasserDes() {
        return des.brasserDes();
    }

    /**
     * Retourne un itérateur permettant de parcourire tous les jouers.
     * @return Itérateur de joueurs.
     */
    public Iterator<Joueur> getIteratorJoueur(){
        return joueurs.iterator();
    }

    /**
     * Retourne un itérateur permettant de parcourire tous les dés.
     * @return Itérateur de dés.
     */
    public Iterator<De> getIteratorDe(){
        return des.iterator();
    }


    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public Joueur[] trieJoueurs(){
        return joueurs.trier();
    }

}
