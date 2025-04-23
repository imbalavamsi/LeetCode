package assessments;

import java.util.Scanner;

public class PerfectOrNot {

    public static void main(String args[]) {
        System.out.println("Enter a positive integer:");
        try (Scanner input = new Scanner(System.in)) {
            String userInput = input.nextLine();

            int nValue;
            try {
                nValue = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                throw new Exception("Only integers are allowed.");
            }

            if (nValue <= 0) {
                throw new Exception("Enter a positive integer greater than 0.");
            }

            System.out.println(isPerfect(nValue) ? "Perfect Number" : "Not Perfect Number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isPerfect(int nValue) {
        if (nValue == 1) return false;

        int sum = 1; // 1 is a divisor
        for (int i = 2; i * i <= nValue; i++) {
            if (nValue % i == 0) {
                sum += i;
                if (i != nValue / i) {
                    sum += nValue / i;
                }
            }
        }
        return sum == nValue;
    }
}
