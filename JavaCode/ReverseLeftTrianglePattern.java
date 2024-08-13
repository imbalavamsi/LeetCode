package JavaCode;

import java.util.Scanner;

public class ReverseLeftTrianglePattern {
    public static void main(String[] args) {
        
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = numberInput.nextInt();
        for(int i=0;i<number;i++)
        {
            for(int j=number;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
        numberInput.close();
    }
}
