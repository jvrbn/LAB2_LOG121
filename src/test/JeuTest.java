package test;

import cadriciel.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JeuTest{

    private Jeu jeu;

    @Before
    public void creationJeu(){
        CollectionDes de = new CollectionDes();
        CollectionJoueurs joueur = new CollectionJoueurs();


        //jeu = new Jeu(de,joueur,1);
    }

    //Test du getter du nombre de face
    @Test
    public void getterNbToursTest(){

        jeu.getNbTours();
        assertTrue(jeu.getNbTours() == 1);
    }

    //Test du setter du nombre de face
    @Test
    public void SetterNbToursTest(){

        jeu.setNbTours(3);
        assertTrue(jeu.getNbTours() == 3);;
    }
}