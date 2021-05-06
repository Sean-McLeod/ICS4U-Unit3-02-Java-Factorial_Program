/*
* This program uses recursion
* to create a factorial program.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-06
*/

import java.util.Scanner;


final class FactorialProgram {
    private FactorialProgram() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static int factorial(final int factorialInt) {
        // This function demonstrates the factorial program
        if (factorialInt == 0 || factorialInt == 1) {
            return 1;
        } else {
            // return & pass parameter
            return factorialInt * factorial(factorialInt - 1);
        }
    }


    public static void main(final String[] args) {
        // input
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial value of it: ");

        try {
            int factorialNumber = userNumber.nextInt();

            if (factorialNumber >= 0) {
                // pass & accept parameters
                int factorialOutcome = factorial(factorialNumber);
                // output
                System.out.println("\nFactorial " + factorialNumber + " is "
                                   + factorialOutcome);
            } else {
                System.out.println("\nPlese enter a positive number");
            }
        } catch (Exception ex) {
            System.out.println("\nThis is not an integer");
        }
    }
}
