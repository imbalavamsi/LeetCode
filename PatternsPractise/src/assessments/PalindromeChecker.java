package assessments;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.println("Enter a string to check for palindrome:");
		try (Scanner input = new Scanner(System.in)) {
			String userInput = input.nextLine();

			if (userInput.isEmpty()) {
				System.out.println("Empty string");
				return;
			}

			boolean result = isPalindrome(userInput);
			System.out.println(result ? "Palindrome" : "Not Palindrome");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static boolean isPalindrome(String input) {
		int start = 0;
		int end = input.length() - 1;
		while (start < end) {
			if (input.charAt(start++) != input.charAt(end--))
				return false;
		}
		return true;
	}
}
