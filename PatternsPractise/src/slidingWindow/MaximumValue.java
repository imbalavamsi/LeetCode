package slidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = InputArray.getInput(scanner);
        scanner.close();

        if (input.isEmpty()) {
            System.out.println("Array is empty.");
            return;
        }

        Collections.sort(input);
        System.out.println("Math max-> Maximum value: "+ Collections.max(input));
        System.out.println("Collections sort-> Maximum value: " + input.get(input.size() - 1));
    }
}
