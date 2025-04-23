package assessments;

import java.util.Scanner;

public class VowelConsonantCounter {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		try (Scanner input = new Scanner(System.in)) {
			String userInput = input.nextLine();
			countVowelsAndConsonants(userInput);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void countVowelsAndConsonants(String input) {
		int vowels = 0, consonants = 0;
		for (char c : input.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}
