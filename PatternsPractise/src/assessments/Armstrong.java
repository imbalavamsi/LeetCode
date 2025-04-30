package assessments;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		  System.out.println("Enter a positive integer:");
	        try (Scanner input = new Scanner(System.in)) {
	            String userInput = input.nextLine();

	            int nValue;
	            try {
	                nValue = Integer.parseInt(userInput);
	            } catch (NumberFormatException e) {
	                throw new Exception("Only integers are allowed.");
	            }

	            if (nValue <= 0) {  
	                throw new Exception("Enter a positive integer greater than 0.");
	            }
	            int powerValue = numberOfDigits(nValue);
	            System.out.println(isArmstrong(nValue,powerValue) ? "Armstrong" : "Not Armstrong");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}
	 private static int numberOfDigits(int nValue) {
	        int count = 0;
	        while (nValue > 0) {
	            count++;
	            nValue /= 10;
	        }
	        return count;
	}
	 
	private static boolean isArmstrong(int nValue,int powerValue) {
	        int actualValue = nValue;
	        if (nValue > 0 && nValue < 10)
	            return true;
	        int temp = 0;
	        while (nValue > 0) {
	            temp += (int) Math.pow(nValue%10,powerValue);
	            nValue /= 10;
	        }
	        return actualValue == temp;
	    }
}