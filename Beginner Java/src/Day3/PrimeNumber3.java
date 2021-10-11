package Day3;

import java.util.Scanner;

public class PrimeNumber3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,count=0,totalprime=0;
        System.out.print("Enter the first value: ");
        m = input.nextInt();
        System.out.print("Ener the last value: ");
        n = input.nextInt();
        for (int i = m; i < n; i++) {
            for (int j = 2; j < i-1; j++)
            {
            if(i%j==0)
            {
                count++;
                break;      
            }
        }
        if(count==0){
            System.out.println(i);
            totalprime++;
        }
        count=0;
        }
        System.out.println("Total prime number: "+totalprime);
    }
}


