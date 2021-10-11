package URI_PRACTICE;
import java.util.Scanner;
public class SALARY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int hours = input.nextInt();
        float amount = input.nextFloat();
        float salary;
        salary = hours * amount;
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",salary);
    }
}
