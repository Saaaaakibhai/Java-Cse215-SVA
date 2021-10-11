
package URI_PRACTICE;

import java.util.Scanner;

public class Simple_Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int serial = input.nextInt();
        int product = input.nextInt();
        float value = input.nextFloat();
        int serial2 = input.nextInt();
        int product2 = input.nextInt();
        float value2 = input.nextFloat();
        float x= (product*value)+(product2*value2);
        System.out.printf("VALOR A PAGAR: R$ %.2f \n",x);
        
    }
}
