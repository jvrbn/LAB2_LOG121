package cadriciel;

/**
 * Une classe abstraite de fabrique permetant de faire des instances de jeux.
 */
public abstract class FabriqueJeu {

    public Jeu fabriquerJeu(){

        CollectionDes des = fabriquerDes();
        CollectionJoueurs joueurs = fabriquerJoueurs();
        IStrategieRegles regles = fabriquerRegles();

        return new Jeu(des, joueurs, regles);
    }

    protected abstract CollectionDes fabriquerDes();

    protected abstract CollectionJoueurs fabriquerJoueurs();

    protected abstract IStrategieRegles fabriquerRegles();
}
