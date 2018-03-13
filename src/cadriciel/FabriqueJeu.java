package cadriciel;

/**
 * Une classe abstraite de fabrique permetant de faire des instances de jeux.
 */
public class FabriqueJeu {

    private int nbJoueurs = 0;
    private int nbDes = 0;
    private int nbFaces = 0;

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
