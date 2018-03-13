package test;

import cadriciel.De;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
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

        de1.setNbrFaces(5);
        assertTrue(de1.compareTo(de2) == -1);
    }

    @Test
    public void deSuperieurTest(){

        de1.setNbrFaces(7);
        assertTrue(de1.compareTo(de2) == 1);
    }

    @Test
    public void memeDeTest(){

        de1.setNbrFaces(5);
        assertTrue(de1.compareTo(de1)== 0);
    }

    @Test
    public void memeDesTest(){

        de1.setNbrFaces(5);
        de2.setNbrFaces(5);
        assertTrue(de1.compareTo(de2)== 0);
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

    @Test//(expected=IllegalArgumentException.class)
    public void deNullTest(){

        try {
            de1.setNbrFaces(0);
        }
        catch (Exception e){
            assertThat(e.getMessage(), is("Le nombre de faces d'un dé doit être supérieur ou égale à 1."));
        }
    }

    @Test
    public void brasserDeTest(){

        //On brasse le dé 10 000 fois pour être sur qu'il passe le test chaque fois
        for(int i = 0 ;i<100000;i++) {

            int random = de1.brasser();
            assertTrue(random <= de1.getNbFaces() && random > 0);
        }
    }
}