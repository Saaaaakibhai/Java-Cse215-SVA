
package URI_PRACTICE;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double r;
        double pi=3.14159,A;
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        System.out.printf("");
        A = pi * r * r;
        System.out.printf("A=%.4f\n",A);
    }
}
