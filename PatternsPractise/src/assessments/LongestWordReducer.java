package assessments;

import java.util.*;

public class LongestWordReducer {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Streams", "are", "very", "powerful");

        String longest = words.stream()
                              .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2)
                              .orElse("Not found");

        System.out.println("Longest word: " + longest);  // Output: powerful
    }
}
