
package Day3;

import java.util.Scanner;

public class FactorialDemo 
{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);  
         int num,factorial=1;
         System.out.print("Enter any number: ");
         num = input.nextInt();
         for (int i = num; i>=1 ; i--) 
        {
            factorial = factorial*i;
        }
         System.out.println("Factorial of "+num+ "is = " +factorial);
     }
}
