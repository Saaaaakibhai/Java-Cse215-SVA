package Array_Demo;
import java.util.Scanner;
public class Array5 
{
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int [2][3];
        int [][] B = new int [2][3];
        int [][] C = new int [2][3];
        //getting input matrix of A
           System.out.println("Enter the element of A: ");
           for (int row = 0; row < 2; row++) {
               for (int col = 0; col < 3; col++) {
                   System.out.printf("A[%d][%d] = ",row,col);
                   A[row][col]= input.nextInt();
               }
               
           }
           
        //getting input matrix of B
           System.out.println("Enter the element of B: ");
           for (int row = 0; row < 2; row++) {
               for (int col = 0; col < 3; col++) {
                   System.out.printf("B[%d][%d] = ",row,col);
                   B[row][col]= input.nextInt();
               }
            }               
        //printing matrix of A
           System.out.print("A= ");
           for (int row = 0; row < 2; row++) {
               for (int col = 0; col < 3; col++) {
                   System.out.print("\t "+A[row][col]);
               }
               System.out.println(" ");            
           }
        //printing matrix of B
           System.out.print("B= ");
           
           for (int row = 0; row < 2; row++) {
               for (int col = 0; col < 3; col++) {
                   
                   System.out.print("\t "+B[row][col]);
               }
               System.out.println(" ");
           }      
           //Adding A and B 
           System.out.print("A+B=");
           for (int row = 0; row < 2; row++) {
               for (int col = 0; col < 3; col++) {
                   C[row][col] = A[row][col]*B[row][col];
                   System.out.print("\t "+C[row][col]);
                   
               }
               System.out.println(" ");
           }
    }
}
