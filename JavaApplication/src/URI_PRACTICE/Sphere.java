package URI_PRACTICE;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = (double) 3.14159;
        int R = input.nextInt();
        double VOLUME = (double) ((4.0/3)*pi*R*R*R);
        System.out.printf("VOLUME = %.3f\n",VOLUME);
    }
}
