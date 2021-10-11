
package URI_PRACTICE;

import java.util.Scanner;

public class AVG2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double MEDIA;
        float x = input.nextFloat();
        float y = input.nextFloat();
        float z = input.nextFloat();
        MEDIA = (x*2+y*3+z*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}
