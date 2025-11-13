/**
 * App.java
 *
 * This is a sample Java application file demonstrating a simple class,
 * the main method, and a utility function.
 */
public class App {

    /**
     * The main entry point for the application.
     * This method is executed when the program starts.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // 1. Output a standard greeting
        System.out.println("--- Java Sample Application ---");
        System.out.println("Hello, World! This is the main method speaking.");

        // 2. Demonstrate variable assignment and a function call
        int num1 = 15;
        int num2 = 7;
        
        // Call a helper function to perform a calculation
        int result = calculateSum(num1, num2);

        // 3. Print the result from the helper function
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        // 4. Example of a loop structure
        System.out.println("\nCounting from 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Current count: " + i);
        }

        System.out.println("--- Application Finished ---");
    }

    /**
     * A simple static method to calculate the sum of two integers.
     * Static methods can be called directly from the main method.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public static int calculateSum(int a, int b) {
        return a + b;
    }
}
