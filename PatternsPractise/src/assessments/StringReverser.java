package assessments;

import java.util.Scanner;

public class StringReverser {

	public static void main(String[] args) {
		System.out.println("Enter a string to reverse:");
		try (Scanner input = new Scanner(System.in)) {
			String userInput = input.nextLine();

			if (userInput.isEmpty()) {
				System.out.println("Empty string");
				return;
			}
			reverseString(userInput);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void reverseString(String input) {
		char[] result = new char[input.length()];
		int j = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			result[j++] = input.charAt(i);
		}
		System.out.println("Reversed: " + new String(result));
	}
}
