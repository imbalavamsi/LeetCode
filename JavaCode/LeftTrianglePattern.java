package JavaCode;

import java.util.Scanner;

public class  LeftTrianglePattern{
    
    public static void main(String args[])
    {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = numberInput.nextInt();

        for(int i=0;i<number;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        numberInput.close();
    }
}