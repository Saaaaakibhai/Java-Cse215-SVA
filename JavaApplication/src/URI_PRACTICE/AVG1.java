package URI_PRACTICE;

import java.util.Scanner;

public class AVG1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double MEDIA;
        float x = input.nextFloat();
        float y = input.nextFloat();
        MEDIA = (x*3.5+y*7.5)/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n",MEDIA);  
    }
}
