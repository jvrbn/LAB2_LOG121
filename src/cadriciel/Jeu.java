package cadriciel;

public class Jeu {

    private int nbTours = 1;
    private CollectionDes des;
    private CollectionJoueurs joueurs;
    IStrategieRegles regles;

    public Jeu(CollectionDes des, CollectionJoueurs joueurs, IStrategieRegles regles) {

        this.des=des;
        this.joueurs=joueurs;
        this.regles=regles;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

}
