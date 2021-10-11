
package Day3;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,temp,sum = 0;
        System.out.print("Enter Any Numebr For Sum:");
        num = input.nextInt();
        temp = num;
        while(temp!=0)
        {
            r = temp % 10;
            sum = sum + r;
            temp = temp /10;
            
            
        }
        
        System.out.print("Sum is: "+sum);
        System.out.println("");
    }
}
