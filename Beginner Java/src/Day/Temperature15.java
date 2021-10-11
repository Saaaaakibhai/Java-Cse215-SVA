
package Day;

import java.util.Scanner;

public class Temperature15 
{
    /*public static void main(String[] args) 
    {
      Scanner input = new Scanner (System.in);
      double cels,farn;
        System.out.print("Enter Celsius: ");
        cels = input.nextDouble();
        farn = ((9*cels)/5)+32;
        System.out.print("Farenheit: "+farn);
    }*/
    public static void main(String[] args) 
    {
      Scanner input = new Scanner (System.in);
      double cels,farn;
      System.out.print("Enter Farenheit: ");
      farn = input.nextDouble();
      cels = ((farn-32)*5)/9;
      System.out.print("Celsius: "+cels);
    }
}
