package assessments;

import java.util.Scanner;

public class SieveOfEratosthenes {

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

			printPrimesUsingSieve(nValue);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void printPrimesUsingSieve(int n) {
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			isPrime[i] = true;
		}

		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); // Move to next line after printing
	}
}
