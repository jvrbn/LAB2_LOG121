package test;

import cadriciel.De;
import org.junit.*;
import static org.junit.Assert.*;

public class DeTest {

    private De de1;
    private De de2;

    @Before
    public void creationDe(){

        de1 = new De(6);
        de2 = new De(6);
    }

    @Test
    public void deInferieurTest(){

        de1.setNbrFaces(7);
        //assertTrue(1==1);
        assertTrue(de1.compareTo(de2) == 1);
    }

    @Test
    public void deSuperieurTest(){

        de1.setNbrFaces(7);
        assertTrue(de2.compareTo(de1) == -1);
    }

    @Test
    public void memeDeTest(){

        de1.setNbrFaces(5);
        assertTrue(de1.compareTo(de1)==0);
    }

    //Test du getter du nombre de face
    @Test
    public void getterDeTest(){

        De de = new De(1);
        assertTrue(de.getNbFaces() == 1);
    }

    //Test du setter du nombre de face
    @Test
    public void SetterDeTest(){

        De de = new De(1);
        de.setNbrFaces(3);
        assertTrue(de.getNbFaces() == 3);
    }
    @Test
    public void brasserDeTest(){

        for(int i = 0 ;i<100000;i++) {

            int random = de1.brasser();
            assertTrue(random <= de1.getNbFaces() && random > 0);
        }
    }
}