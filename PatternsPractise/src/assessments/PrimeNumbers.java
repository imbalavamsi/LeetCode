package assessments;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        try (Scanner input = new Scanner(System.in)) {
            String userInput = input.nextLine();

            int nValue;
            try {
                nValue = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                throw new Exception("Only integers are allowed.");
            }

            if (nValue < 2) {
                throw new Exception("Error: Enter a number greater than or equal to 2.");
            }

            for (int i = 2; i <= nValue; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Move cursor to next line after printing primes
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isPrimeNumber(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
