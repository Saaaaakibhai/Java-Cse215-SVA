
package Day3;

import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,r,temp;
        System.out.println("Enter Anything: ");
        num = input.nextInt();
        temp = num;
        while(temp!=0)
        {
            r = temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(num==sum)
        {
            System.out.println("Pelindrome");
        }
        else
        {
            System.out.println("Not Pelindrome");
        }
    }        
}
