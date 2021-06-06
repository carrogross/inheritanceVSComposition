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
        int numberOfExecutions = 100000000;

        long inheritanceStartTime = System.currentTimeMillis();
        while(numberOfExecutions > 0) {
            inheritance.randomNumber();
            numberOfExecutions--;
        }
        long totalTimeForInheritance = System.currentTimeMillis() - inheritanceStartTime;

        numberOfExecutions = 100000000;
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
