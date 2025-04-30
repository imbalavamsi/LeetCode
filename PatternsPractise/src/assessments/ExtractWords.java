package assessments;

import java.util.*;
import java.util.stream.*;

public class ExtractWords {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("Java is awesome", "Streams are powerful", "Master them well");

		// TODO:
		// Step 1: Stream the list of sentences
		// Step 2: Split each sentence into words
		// Step 3: Use flatMap to flatten the structure
		// Step 4: Collect into a list

//		System.out.println(sentences);
		List<String> words = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());

		// Expected Output: [Java, is, awesome, Streams, are, powerful, Master, them,
		// well]
		System.out.println("Extracted Words: " + words);
	}
}
