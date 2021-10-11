package URI_PRACTICE;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float total;
        String name = input.nextLine();
        float salary = input.nextFloat();
        float sale = input.nextFloat();
        total = (float) (salary + sale*0.15); 
        System.out.printf("TOTAL = R$ %.2f\n",total);
    }
}
