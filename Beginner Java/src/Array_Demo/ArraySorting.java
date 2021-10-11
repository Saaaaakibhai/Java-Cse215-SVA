
package Array_Demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println("Before sorting: "+number);
        Collections.sort(number);
        System.out.println("After Sorting in Ascending: "+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After Sorting in Desecding: "+number);        
        
    }
    
}
