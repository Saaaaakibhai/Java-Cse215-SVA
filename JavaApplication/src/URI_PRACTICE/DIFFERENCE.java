package URI_PRACTICE;

import java.util.Scanner;

public class DIFFERENCE {
          public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int DIFF;
          int A = input.nextInt();
          int B = input.nextInt();
          int C = input.nextInt();
          int D = input.nextInt();
          DIFF = (A*B)-(C*D);
              System.out.printf("DIFERENCA = %d\n",DIFF); 
    }
}
