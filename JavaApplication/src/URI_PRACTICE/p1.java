
package URI_PRACTICE;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        a=input.nextInt();
        int b=0;
        b=input.nextInt();   
        int c=0;
        c=input.nextInt();
        int d=0;
        d=input.nextInt();
        if((b>c)&&(d>a)&&(c+d>a+b)&&c>0 &&d>0&&(a%2==0))
            System.out.println("Valores aceitos");
        else 
            System.out.println("Valores nao aceitos");
    }
}