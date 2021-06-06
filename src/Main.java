/**
 * Main class containing the main method.
 */
public class Main {

    /**
     * Main method to start the program execution.
     * @param args Array of command line arguments .
     */
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        Composition composition = new Composition();
        int startingNumber = 100000000;
        int numberOfExecutions = startingNumber;

        long inheritanceStartTime = System.currentTimeMillis();
        while(numberOfExecutions > 0) {
            inheritance.randomNumber();
            numberOfExecutions--;
        }
        long totalTimeForInheritance = System.currentTimeMillis() - inheritanceStartTime;

        numberOfExecutions = startingNumber;
        long compositionStartTime = System.currentTimeMillis();
        while(numberOfExecutions > 0) {
            composition.randomNumber();
            numberOfExecutions--;
        }
        long totalTimeForComposition = System.currentTimeMillis() - compositionStartTime;

        System.out.println("Total time for Inheritance: " + totalTimeForInheritance + " ms");
        System.out.println("Total time for Composition: " + totalTimeForComposition + " ms");
    }
}
