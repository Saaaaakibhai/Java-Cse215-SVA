
package Array_Demo;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] number = new double [5];
        double sum = 0;
        System.out.println("Please Enter Five Number: ");
        for (int i = 0; i < number.length; i++) {
            number [i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number [i];
        }
        double avg = sum/number.length; //here we can use sum/5
        System.out.println("Sum: "+sum);
        System.out.println("Avarage "+avg);
        double max = number [0];
        double min = number [0];
        for (int i = 1; i < 10; i++) {
            if(max<number[i])
            {
                max=number[i];
            }
            if(min>number[i])
            {
                min=number[i];
            }
        }
        
    }
     
}
