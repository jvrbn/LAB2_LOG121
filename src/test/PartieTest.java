package test;

import bunco.PartieBunco;
import cadriciel.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PartieTest {

    PartieBunco partie;

    DeMock de1;
    DeMock de2;
    DeMock de3;

    @Before
    public void initPartie() {

        de1 = new DeMock(1);
        de2 = new DeMock(1);
        de3 = new DeMock(1);

        CollectionDes des = new CollectionDes();
        des.ajouterDe(de1);
        des.ajouterDe(de2);
        des.ajouterDe(de3);

        FabriqueMock fabrique = new FabriqueMock(des);

        partie = new PartieBunco(fabrique);
    }

    @Test
    public void jouerTourTest(){

        // 21, Il doit passer la main.
        assertTrue(partie.jouerTour());

        de1.setResultat(2);
        de2.setResultat(2);
        de3.setResultat(2);

        // 5, Il ne passe pas la main.
        assertTrue(!partie.jouerTour());

        de1.setResultat(1);

        // 1, Il ne passe pas la main.
        assertTrue(!partie.jouerTour());

        de2.setResultat(1);

        // 2, Il ne passe pas la main.
        assertTrue(!partie.jouerTour());

        de1.setResultat(3);
        de2.setResultat(4);

        // 0, Il doit passer la main.
        assertTrue(partie.jouerTour());
    }

    @Test
    public void changerJoueurTest(){

        //Nous avons 4 joueurs. Nous commencons au premier.
        assertTrue(partie.changerJoueur());
        assertTrue(partie.changerJoueur());
        assertTrue(!partie.changerJoueur());
    }

    @Test
    public void obtenirClassementTest(){

        //Bunco 21
        partie.jouerTour();

        //Joueur 2
        partie.changerJoueur();

        de1.setResultat(2);

        // 2 point, ne donne pas la main
        partie.jouerTour();

        de2.setResultat(2);
        de3.setResultat(4);

        // 0 point, donne la main
        partie.jouerTour();

        // Joueur 3
        partie.changerJoueur();

        //0 point, passe la main
        partie.jouerTour();

        //Joueur 4
        partie.changerJoueur();

        de1.setResultat(1);
        de2.setResultat(1);
        de3.setResultat(2);

        //2 point, garde la main
        partie.jouerTour();

        de3.setResultat(1);

        //21 points
        partie.jouerTour();

        //Devrait être 23, 21, 2, 0
        Joueur[] joueurs = partie.obtenirClassement();

        assertTrue(joueurs[0].getScore() == 23 && joueurs[1].getScore() == 21 && joueurs[2].getScore() == 2 && joueurs[3].getScore() == 0);

        //Prochain tour
        partie.changerTour();

        //5 points garde la main.
        partie.jouerTour();

        de1.setResultat(3);
        de2.setResultat(4);
        de3.setResultat(5);

        //0 point passe la main
        partie.jouerTour();

        //Joueur 2
        partie.changerJoueur();

        de1.setResultat(2);

        // 1 point, ne donne pas la main
        partie.jouerTour();

        de2.setResultat(2);
        de3.setResultat(4);

        // 2 point, ne donne pas la main
        partie.jouerTour();

        de3.setResultat(2);

        //21 point, passe la main
        partie.jouerTour();

        // Joueur 3
        partie.changerJoueur();

        //21 point, passe la main
        partie.jouerTour();

        //Joueur 4
        partie.changerJoueur();

        de1.setResultat(4);
        de2.setResultat(5);
        de3.setResultat(6);

        //0 point, garde la main
        partie.jouerTour();

        //Devrait être 26,26,23,21
        joueurs = partie.obtenirClassement();
        assertTrue(joueurs[0].getScore() == 26 && joueurs[1].getScore() == 26 && joueurs[2].getScore() == 23 && joueurs[3].getScore() == 21);
    }
}
