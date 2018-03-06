package test;

import cadriciel.De;
import junit.framework.TestCase;
import org.junit.*;
import junit.framework.TestCase;

public class DeTest extends TestCase {

    private De de1;
    private De de2;

    @Before
    public void creationDe(){

        de1 = new De(6);
        de2 = new De(6);
    }

    @Test
    public void memeDeTest(){
        de1.setNbrFaces(5);
        assertTrue(de1.compareTo(de1)==0);
    }

    @Test
    public void brasserDeTest(){

        assertNotNull(de1.brasser());
    }
}