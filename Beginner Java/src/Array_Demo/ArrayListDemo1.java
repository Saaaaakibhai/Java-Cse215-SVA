
package Array_Demo;

import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,60);
        System.out.println("ArrayList Contains: "+number);
        /*
        for(int x : number)
        {
        System.out.print(x);
        }
        */
        /*
        number.forEach((x) -> {
            System.out.print(x);
        });
        */
        /*
        Iterator itr = number.iterator();
        while(itr.hasNext())
        {
            System.out.println(" "+itr.next());
        */   
        System.out.println();
        System.out.println("Size = "+number.size());
        //Removing Elements
        number.remove(2);
        System.out.println("After removing array list contains: "+number);
        number.removeAll(number);
        System.out.println("All removing number: "+number);
           
    }
    
}
