
package Array_Demo;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int [] number = {50,-8,5,45,21};
        Arrays.sort(number);
        System.out.println("Ascending: ");
        
        for (int i = 0; i <= 4; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.println("Decending: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println("");
        String[] names = {"Sakib","Riya","Jakir","Sayma"};
        Arrays.sort(names);
        System.out.println("Names");
        for (int i = 0; i <= 3; i++) {
            System.out.print(" "+names[i]);
            System.out.println(" ");
        }
        System.out.println("Reverse Names");
        for (int i = 3; i >= 0; i--) {
            System.out.println(" "+names[i]);
            
        }
    }
    
}
