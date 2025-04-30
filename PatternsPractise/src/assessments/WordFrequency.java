package assessments;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = scanner.nextLine();

        if (input == null || input.trim().isEmpty() || input.chars().noneMatch(Character::isLetter)) {
            System.out.println("Empty input");
            scanner.close();
            return;
        }

        countWordFreq(input);

        System.out.print("Do you want to reverse it recursively? (y/n): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        switch (choice) {
            case "y":
                System.out.println("Reversed string: " + reverseRecursively(input));
                break;
            case "n":
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void countWordFreq(String str) {
        Map<String, Integer> wordFreq = new TreeMap<>(); // Sorted alphabetically
        for (String word : str.split(" ")) {
            word = word.toLowerCase().replaceAll("[^a-z']", ""); // Keep a-z and apostrophes
            if (!word.isEmpty()) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("\nWord Frequencies (a-z):");
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static String reverseRecursively(String str) {
        if (str == null || str.length() <= 1)
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
