package assessments;

import java.util.Scanner;

public class PalindromeOrNot {

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

            if (nValue <= 0) {  // corrected here
                throw new Exception("Enter a positive integer greater than 0.");
            }

            System.out.println(isPalindrome(nValue) ? "Palindrome" : "Not Palindrome");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isPalindrome(int nValue) {
        int actualValue = nValue;
        if (nValue > 0 && nValue < 10)
            return true;
        if (nValue % 10 == 0)
            return false;
        int temp = 0;
        while (nValue > 0) {
            temp = temp * 10 + nValue % 10;
            nValue /= 10;
        }
        return actualValue == temp;
    }
}
