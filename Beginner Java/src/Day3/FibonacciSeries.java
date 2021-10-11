package Day3;
import java.util.Scanner;
public class FibonacciSeries {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int first=-1;
         int second=1;
         int fibo;
         System.out.println("Enter fibonacci series you want: ");
         int n = input.nextInt();

         for (int i = 1; i <=n; i++) {
             fibo=first+second;
             System.out.print(" "+fibo);
             first=second;
             second=fibo;
         }
         System.out.println();
    }
}
