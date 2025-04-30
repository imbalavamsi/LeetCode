package assessments;

import java.util.*;

public class FrequencyAndReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = scanner.nextLine();

        if (input == null || input.trim().isEmpty() || input.chars().noneMatch(Character::isLetter)) {
            System.out.println("Empty input");
            return;
        }

        countCharFreq(input);

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

    // method must be inside same class
    private static void countCharFreq(String str) {
        Map<Character, Integer> charFreq = new TreeMap<>();
        Map<Character, Character> originalCasing = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char key = Character.toLowerCase(ch);
                originalCasing.putIfAbsent(key, ch);
                charFreq.put(key, charFreq.getOrDefault(key, 0) + 1);
            }
        }

        for (Character key : charFreq.keySet()) {
            char displayChar = originalCasing.get(key);
            System.out.println(displayChar + ":" + charFreq.get(key));
        }
    }

    private static String reverseRecursively(String str) {
        if (str == null || str.length() <= 1)
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
