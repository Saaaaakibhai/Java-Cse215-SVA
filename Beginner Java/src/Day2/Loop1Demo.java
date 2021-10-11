package Day2;

import java.util.Scanner;

public class Loop1Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        int sum=0;
        int m,n;
        System.out.print("Enter Initial Number: ");
        m = input.nextInt();
        System.out.print("Enter Final Number: ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) 
        {
            if(i%2!=0)   
            {     
               sum = sum+i;
                System.out.println(" "+i);
            }
        }
        System.out.println("The sum is:"+sum);
    }
    
}
