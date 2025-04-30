package assessments;

import java.util.*;
import java.util.stream.*;

public class FirstNameStartsWithA {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Andrew");

		// TODO:
		// Step 1: Use Stream API to filter names starting with 'A'
		// Step 2: Get the first match using a short-circuiting method
		// Step 3: Return the result or "Not Found"

//		for (String name : names) {
//			if (!name.isEmpty() && !name.equals(null) && name.charAt(0) == 'A') {
//				System.out.println("First name starting with A: " + name);
//				break;
//			}
//		System.out.println("Not found");
		String result = names.stream().filter(name -> name != null && !name.isEmpty() && name.charAt(0) == 'A')
				.findFirst().orElse("Not Found");

		System.out.println("First name starting with A: " + result);
	}
}
