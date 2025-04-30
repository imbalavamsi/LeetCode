package snippets;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;

		// TODO: Print "Even" if number is even, "Odd" if number is odd using if-else

		if (n > 0) {
			if (n % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		} else {
			System.out.println("Invalid input");
		}
	}
}
