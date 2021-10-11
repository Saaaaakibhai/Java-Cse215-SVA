package URI_PRACTICE;
import java.util.Scanner;
public class BankNotes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.printf("%d nota(s) de R$ 100,00\n",N/100);
        N%=100;
            System.out.printf("%d nota(s) de R$ 50,00\n",N/50);
        N%=50;
            System.out.printf("%d nota(s) de R$ 20,00\n",N/20);
        N%=20;
            System.out.printf("%d nota(s) de R$ 10,00\n",N/10);
        N%=10;
            System.out.printf("%d nota(s) de R$ 5,00\n",N/5);
        N%=5;
            System.out.printf("%d nota(s) de R$ 2,00\n",N/2);
        N%=2;
            System.out.printf("%d nota(s) de R$ 1,00\n",N);
        
    }
}
