package assessments;

import java.util.*;

public class WordLengthCounter {

	public static void main(String[] args) {
		String[] words = { "hi", "hello", "hey", "sun", "world" };

		Map<Integer, Integer> wordLengths = new HashMap<>();

		for (String word : words) {
			int len = word.length();
			// TODO: Use getOrDefault() to update count of this length
			wordLengths.put(len, wordLengths.getOrDefault(len, 0) + 1);
		}

		// TODO: Print the final word length counts
		for (int i : wordLengths.keySet())
			System.out.println(i + ": " + wordLengths.get(i));
	}
}
