package assessments;

import java.util.ArrayList;
import java.util.Scanner;

public class SievePrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min range:");
		int x= sc.nextInt();
		System.out.println("Enter max range:");	
		int n = sc.nextInt();
		ArrayList<Integer> primes = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			primes.add(1);
		}

		primes.set(0, 0);
		primes.set(1, 0);

		for (int i = 2; i * i <= n; i++) {
			if (primes.get(i) == 1) {
				for (int j = i * i; j <= n; j += i) {
					primes.set(j, 0);
				}
			}
		}

		for (int i = x; i <= n; i++) {
			if (primes.get(i) == 1) {
				System.out.println(i + " is prime");
			}
		}
		sc.close();
	}
}
