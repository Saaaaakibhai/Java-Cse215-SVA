
package Day3;

import java.util.Scanner;


public class PrimeNumber2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Any Number:");
         int num = input.nextInt();
         boolean flag = false;
         for (int i = 2; i < num/2; i++) {
             if(num%i==0)
             {
                 flag=true;
                 break;
             }
            
        }
         if(!flag)
             System.out.println(num+" is a prime number");
         else 
             System.out.println(num+" is not a prime number");
    }
    
}
    
