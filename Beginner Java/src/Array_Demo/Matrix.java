package Array_Demo;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [][] A = new int [3][3];
        int sumofdiagonal=0;
        int sumofupper=0;
        int sumoflower=0;
        //Matrix Input
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                A [row][col]= input.nextInt();
            }
        }
        //Getting the value
        for (int row = 0; row < 3; row++) 
        {
            
            for (int col = 0; col < 3; col++) 
            {
             
               if(row==col)
               {
                   sumofdiagonal = sumofdiagonal + A[row][col];
               }
               if(col>row)
               {
                     sumofupper = sumofupper + A[row][col];
               }
               if(row>col)
               {
                   sumoflower = sumoflower + A[row][col];
               }
            }  
        }
        System.out.println("Sumofdiagonal: "+sumofdiagonal);
        System.out.println("Sumofupper: "+sumofupper);
        System.out.println("Sumoflower: "+sumoflower);
    }   
}
