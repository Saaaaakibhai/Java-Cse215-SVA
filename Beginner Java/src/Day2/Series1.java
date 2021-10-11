
package Day2;

import java.util.Scanner;

public class Series1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter the last number that going to sum: ");
        n =  input.nextInt();
        for (int i =  1 ; i <=n;i++) 
        {
            System.out.println(i+"*"+i);
            sum = sum + i*i;
        }
        System.out.println("Sum of that:"+sum);
    }
}
