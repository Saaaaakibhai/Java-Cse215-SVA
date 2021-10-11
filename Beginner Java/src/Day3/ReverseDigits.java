
package Day3;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0 , r , temp;
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        temp = num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum*10+r;
            temp = temp / 10;
        }
        System.out.print("Reverse is: "+sum);
        System.out.println("");
    }
    
}
