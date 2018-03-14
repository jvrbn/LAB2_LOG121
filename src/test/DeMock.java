package test;

import cadriciel.De;

public class DeMock extends De {

    private int resultat = 0;

    /**
     * Un dé truqué qui va toujours obtenir le chiffre en paramètre.
     * @param resultat La valeur que l'on veut toujours obtenir sur le dé.
     */
    public DeMock(int resultat){
        super(6);

        this.resultat = resultat;
    }

    public void setResultat(int resultat){
        this.resultat = resultat;
    }

    @Override
    public int brasser() {

        return resultat;
    }
}
