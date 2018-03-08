package test;

import cadriciel.Joueur;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JoueurTest{

    private Joueur joueur1;
    private Joueur joueur2;

    @Before
    public void creationJoueur(){

        joueur1 = new Joueur();
        joueur2 = new Joueur();
    }

    @Test
    public void deInferieurTest(){

        joueur1.setScore(1);
        joueur2.setScore(2);
        assertTrue(joueur1.compareTo(joueur2) == -1);
    }

    @Test
    public void deSuperieurTest(){

        joueur1.setScore(2);
        joueur2.setScore(1);
        assertTrue(joueur1.compareTo(joueur2) == 1);
    }

    @Test
    public void memeDeTest(){

        joueur1.setScore(1);
        joueur2.setScore(1);
        assertTrue(joueur1.compareTo(joueur2) == 0);
    }

    //Test du getter du nombre de face
    @Test
    public void getterJoueurTest(){

        Joueur joueur = new Joueur();
        assertTrue(joueur.getScore() == 0);
    }

    //Test du setter du nombre de face
    @Test
    public void SetterJoueurTest(){

        Joueur joueur = new Joueur();
        joueur.setScore(2);
        assertTrue(joueur.getScore() == 2);
    }
}
