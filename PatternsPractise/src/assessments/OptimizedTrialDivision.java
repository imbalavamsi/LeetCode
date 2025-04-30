package assessments;

import java.util.ArrayList;

public class OptimizedTrialDivision {
    public static void main(String[] args) {
        int n = 20;
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            primes.add(1); // assume prime
        }

        primes.set(0, 0);
        primes.set(1, 0);

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primes.set(i, 0);
                    break;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes.get(i) == 1) {
                System.out.println(i + " is prime");
            }
        }
    }
}
