package slidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArray {

	public static ArrayList<Integer> getInput(Scanner read) {

		System.out.println("Enter the size of array");
		int arrSize = read.nextInt();

		ArrayList<Integer> input = new ArrayList<Integer>();
		System.out.println("Enter Array");
		for(int index=0;index<arrSize;index++)
			input.add(read.nextInt());

		System.out.println("Array List:\n"+input);

		return input;
	}

}
