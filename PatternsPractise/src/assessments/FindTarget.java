package assessments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	        System.out.println("How many integers you want to add?");
	        int n = input.nextInt();
	        
	        List<Integer> numbers = new ArrayList<>();
	        
	        for (int i = 0; i < n; i++) {
	            System.out.println(i + " numbers entered, enter the next: ");
	            numbers.add(input.nextInt());
	        }

	        System.out.println("Unsorted List is: " + numbers);

	        // Sorting using basic bubble sort
	        for (int i = 0; i < numbers.size(); i++) {
	            for (int j = i + 1; j < numbers.size(); j++) {
	                if (numbers.get(i) > numbers.get(j)) {
	                    // Correct way to swap values in ArrayList
	                    int temp = numbers.get(i);
	                    numbers.set(i, numbers.get(j));
	                    numbers.set(j, temp);
	                }
	            }
	        }

	        System.out.println("Sorted List is: " + numbers);

	        input.close();
	}
	
	
}
