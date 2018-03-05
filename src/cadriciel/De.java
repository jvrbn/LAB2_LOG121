package cadriciel;

/**
 * Représente un dé dans un jeu de dés. Permet d'être brassé pour obtenir un chiffre aléatoir entre 1 et X.
 */
public class De {
    private int nbrFaces ;

    public De(int nbFaces) {
        //Le nombre de face d'un dé ne peut pas être négatif ou zéro.
        if(nbFaces < 1)
            throw new IllegalArgumentException("Le nombre de faces d'un dé doit être supérieur ou égale à 1.");

        nbrFaces = nbFaces;
    }

    public int getNbFaces(){
        return nbrFaces;
    }

    /**
     * Génere un chiffre aléatoire entre 1 et le nombre de faces du dé.
     * @return Un chiffre aléatoire.
     */
    public int brasser() {
        return  (int)(Math.random() * nbrFaces + 1);
    }
}
