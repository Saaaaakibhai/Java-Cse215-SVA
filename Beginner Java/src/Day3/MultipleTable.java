
package Day3;

import java.util.Scanner;


public class MultipleTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.print("Enter the first value of number:");
        n = input.nextInt();
        System.out.print("Enter the first value of number:");
        m = input.nextInt();
        for (int i = n; i <=m; i++)  {
            
            for (int j = 1; j <=10; j++)  {
                
            
            System.out.println(i+"*"+j+"="+i*j);
           
            }
            System.out.println("\n");
        }
        
    }
    
}
