package cadriciel;

import java.util.Iterator;

/**
 * Représente une collection de dés
 */
public class CollectionDes implements Iterable<De> {

    private De[] des;
    private int nbDes;

    public CollectionDes(){
        des = new De[10];
    }

    public int getNbDes(){
        return nbDes;
    }

    /**
     * Permet d'ajouter un dé à la collection de dés.
     * @param de Le dé à être ajouté.
     */
    public void ajouterDe(De de){

        //Si notre tableau est plein, on l'agrandit
        if(nbDes >= des.length){
            De[] nouveauDes = new De[des.length * 2];

            System.arraycopy(des, 0, nouveauDes, 0, des.length);

            des = nouveauDes;
        }

        //On ajoute le nouveau dé et on augmente le nombre de dés
        des[nbDes] = de;

        nbDes++;
    }

    /**
     * Brasse tous les dés et renvoie leur résultat.
     * @return Le résultat de toutes les générations aléatoires.
     */
    public int[] brasserDes() {
        int[] resultats = new int[nbDes];

        int i = 0;

        for(De de : this){
            resultats[i] = de.brasser();
            i++;
        }

        return resultats;
    }

    /**
     * Créer un itérateur permetant de parcourir la collection.
     * @return Un itérateur permetant de parcourir la collection de dés.
     */
    public Iterator<De> iterator() {
        return new Iterator<De>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if(currentIndex < nbDes - 1)
                    return true;
                return false;
            }

            @Override
            public De next() {
                return des[currentIndex++];

            }
        };
    }
}
