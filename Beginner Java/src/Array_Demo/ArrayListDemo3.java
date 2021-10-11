package Array_Demo;

import java.util.ArrayList;

public class ArrayListDemo3 {
      public static void main(String[] args) {
        ArrayList<Integer>number1 = new ArrayList<>();
        ArrayList<Integer>number2 = new ArrayList<>();
        ArrayList<Integer>number3 = new ArrayList<>();
        ArrayList<Integer>number4 = new ArrayList<>();
        number1.add(10);
        number1.add(15);
        number1.add(17);
        number1.add(19);
        
        number2.add(20);
        number2.add(12);
        number2.add(13);
        number2.add(14);
        
        
        
        number3.addAll(number2);
          System.out.println("number 3 = "+number2);
        boolean result = number1.equals(number2);
          System.out.println("number1 == number2: "+result);
        result = number2.equals(number3);
          System.out.println("number2 == number3: "+result);
        
        
    }
}
