import java.util.Random;

/**
 * Composition class creating a Random object.
 */
public class Composition {
    private Random random = new Random();

    /**
     * Randomizing an int.
     */
    void randomNumber(){
        random.nextInt();
    }
}
