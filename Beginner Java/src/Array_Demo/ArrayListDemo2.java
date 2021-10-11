package Array_Demo;
import java.util.ArrayList;
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size: "+number.size());
        number.add(12);
        number.add(23);
        number.add(2,90);
        number.add(50);
        System.out.println("ArrayListContain: "+number);
        System.out.println("After Putting input than Size: "+number.size()); 
        /*
        number.remove(1);
        System.out.println("After remove: "+number);
        //number.removeAll(number);
        //number.clear();
        System.out.println("AfterRemovingAll: "+number);
        */
        //number.clear();
        boolean check = number.isEmpty();
        System.out.println("ArrayList Empty: "+check);
        boolean contain = number.contains(30);
        System.out.println("is 30 in the list? "+contain);
        int pos = number.indexOf(23);
        System.out.println("The index of 23: "+pos);
        number.set(1,65);
        System.out.println("After Setting number: "+number);
        int lubra = number.get(0);
        System.out.println("Index of 0 is: "+lubra);
                
    } 
}
