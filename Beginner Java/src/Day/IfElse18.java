
package Day;

import java.util.Scanner;

public class IfElse18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any integer:");
        num = input.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0) 
        {
            System.out.println("Negetive");
        }
        else 
            System.out.println("Zero");
        
    }
    
}
