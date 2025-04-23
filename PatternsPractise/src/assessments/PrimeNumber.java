package assessments;

import java.util.Scanner;

public class PrimeNumber {

    // Helper method to check for primality
    public static boolean isPrime(int n) {
       
    	// Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        // All other even numbers are not prime
        if (n % 2 == 0) {
            return false;
        }
        // Check for factors only up to the square root of n, iterating only over odd numbers
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N value:");
        int n = input.nextInt();
        
        boolean result = isPrime(n);
        System.out.println("Is " + n + " a prime number? " + result);
        
        input.close();  // Close the scanner resource
    }
}
