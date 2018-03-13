/*
package bunco;

import cadriciel.*;

/**
 * Implémentation d'une fabrique de jeu permettant de faire une partie de Bunco+.
 *
public class FabriqueBunco extends FabriqueJeu {

    private int nbJoueurs = 0;

    public FabriqueBunco(int nbJoueurs){

        if(nbJoueurs < 1)
            throw new IllegalArgumentException("Il doit y avoir au moins un joueur.");

        this.nbJoueurs = nbJoueurs;
    }

    @Override
    protected CollectionDes fabriquerDes() {

        CollectionDes des = new CollectionDes();

        for(int i = 0; i < 3; i++){
            des.ajouterDe(new De(6));
        }

        return des;
    }

    @Override
    protected CollectionJoueurs fabriquerJoueurs() {

        CollectionJoueurs joueurs = new CollectionJoueurs();

        for(int i = 0; i < nbJoueurs; ++i){
            joueurs.ajouterJoueur(new Joueur());
        }

        return joueurs;
    }

    @Override
    protected IStrategieRegles fabriquerRegles() {
        return new RegleBunco();
    }
}
*/
