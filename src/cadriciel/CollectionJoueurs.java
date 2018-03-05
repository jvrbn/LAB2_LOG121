package cadriciel;

import java.util.Iterator;

/**
 * Représente une collection de joueurs.
 */
public class CollectionJoueurs implements Iterable<Joueur> {

    private Joueur[] joueurs;
    private int nbJoueurs = 0;

    public CollectionJoueurs() {
        joueurs = new Joueur[10];
    }

    public int getNbJoueur(){
        return nbJoueurs;
    }

    /**
     * Permet d'ajouter un joueur à notre collection.
     * @param joueur Le joueur à être ajouté.
     */
    public void ajouterJoueur(Joueur joueur) {

        // Si notre tableau est plein, nous allons l'agrandir.
        if(nbJoueurs == joueurs.length){
            Joueur[] nouveauJoueurs = new Joueur[joueurs.length * 2];

            System.arraycopy(joueurs, 0, nouveauJoueurs, 0, joueurs.length);

            joueurs = nouveauJoueurs;
        }

        //On ajoute notre joueur, puis on incrémente le compteur pour le nombre de joueur.
        joueurs[nbJoueurs] = joueur;

        nbJoueurs++;
    }

    /**
     * Retourne un itérateur permetant de parcourir notre collection de joueurs.
     * @return Un itérateur de joueurs.
     */
    public Iterator<Joueur> iterator() {
        return new Iterator<Joueur>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if(currentIndex < nbJoueurs)
                    return true;
                return false;
            }

            @Override
            public Joueur next() {
                return joueurs[currentIndex++];

            }
        };
    }




}
