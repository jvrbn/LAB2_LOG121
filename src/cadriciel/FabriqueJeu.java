package cadriciel;

/**
 * Une classe abstraite de fabrique permetant de faire des instances de jeux.
 */
public abstract class FabriqueJeu {

    /**
     * Fabrique un jeu de dé avec des dés, des joueurs et des regles de jeu.
     * @return Un jeu prêt à être joué.
     */
    public Jeu fabriquerJeu(){

        CollectionDes des = fabriquerDes();
        CollectionJoueurs joueurs = fabriquerJoueurs();
        IStrategieRegles regles = fabriquerRegles();

        return new Jeu(des, joueurs, regles);
    }

    /**
     * Méthode servant à initialiser les dés pour le jeu.
     * @return Une collection de dés prêt à être joué.
     */
    protected abstract CollectionDes fabriquerDes();

    /**
     * Méthode servant à initialiser les joueurs pour le jeu.
     * @return Une collection de joueurs prêt à jouer un jeu
     */
    protected abstract CollectionJoueurs fabriquerJoueurs();

    /**
     * Les règles
     * @return
     */
    protected abstract IStrategieRegles fabriquerRegles();
}
