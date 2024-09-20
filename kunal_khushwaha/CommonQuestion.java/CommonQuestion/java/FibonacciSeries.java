// package CommonQuestion.java;

/**
 * This class generates and prints the Fibonacci series up to a given number of terms.
 * 
 * The Fibonacci series is a series of numbers where a number is the sum of the two preceding ones, 
 * usually starting with 0 and 1.
 * 
 * @author [Your Name]
 */
public class FibonacciSeries {

    /**
     * This method generates and prints the Fibonacci series up to a given number of terms.
     * 
     * @param n The number of terms in the Fibonacci series.
     */
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    /**
     * Main method to test the printFibonacciSeries method.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int n = 10; // Example usage with 10 terms
        printFibonacciSeries(n);
    }
}