package cadriciel;
import java.util.Random;

public class De {
    private int nbrFaces ;
    private static final int MAX = 6;
    private static final int MIN = 1;



    public int brasser() {

        Random ran = new Random();
        return ran.nextInt(MAX-MIN+1)+MIN;


    }
}

