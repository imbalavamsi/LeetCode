package JavaCode;

import java.util.Scanner;

public class ReversePyramid {

    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = numberInput.nextInt();
        
        for(int i=number;i>0;i--)
        {
            for(int j=1;j<=number*2-1;j++)
            {
                if(j>number-i && j<number+i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
       
        numberInput.close();
    
    }
    
}
