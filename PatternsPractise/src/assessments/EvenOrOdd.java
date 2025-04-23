package assessments;

import java.util.Scanner;

public class EvenOrOdd {
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

            if (nValue < 0) {
                throw new Exception("Negative numbers are not allowed.");
            }

            System.out.println((nValue % 2 == 0) ? "Even" : "Odd");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
	