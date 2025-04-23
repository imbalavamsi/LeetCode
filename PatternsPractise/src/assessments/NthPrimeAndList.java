package assessments;

import java.util.ArrayList;
import java.util.List;

public class NthPrimeAndList {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
    	
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to find the nth prime and collect all primes till that point
    public static List<Integer> findNthPrimeAndList(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 100; // Example: get first 100 primes
        List<Integer> primes = findNthPrimeAndList(n);

        System.out.println("The " + n + "th prime number is: " + primes.get(primes.size() - 1));
        System.out.println("List of first " + n + " prime numbers:");
        System.out.println(primes);
    }
}
