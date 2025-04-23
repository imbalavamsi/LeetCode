package assessments;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        try (Scanner input = new Scanner(System.in)) {
            String userInput = input.nextLine();
            int nValue;
            try {
                nValue = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                throw new Exception("Error: Only integers are allowed.");
            }

            if (nValue < 2) {
                throw new Exception("Error: Enter a number greater than 1.");
            }

            System.out.println(isInputPrime(nValue) ? "Prime" : "Not Prime");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isInputPrime(int nValue) {
        if (nValue == 2) return true;
        if (nValue % 2 == 0) return false;
        for (int i = 3; i * i <= nValue; i += 2) {
            if (nValue % i == 0) return false;
        }
        return true;
    }
}
