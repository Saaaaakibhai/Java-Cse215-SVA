
package Array_Demo;

public class Array3 {
     public static void main(String[] args) {
        /* String[] names = new String[4];
         names[0]="Anis";
         names[1]="Hasan";
         names[2]="Sakib";
         names[3]="Fahim";
         for (int i = 0; i < 4; i++) 
         {
             System.out.println(names[i]);
         }*/
        /*
         String [] names = {"Anis","Hasan","Sakib","Fahim","Kuddos","BokaChondro"};
         for (String x: names)
         {
             System.out.println(x);
         }
        */
        int [] num = {10,20,30,50,90,100};
        int sum = 0;
        for(int x:num)
        {
            sum = sum +x;
        }
        System.out.println(sum);
    }
}
