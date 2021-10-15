

import java.util.Scanner;

public class TASK1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer number: ");
		int n = input.nextInt();
		System.out.println();

		String temp = ""+n;
		int space = temp.length();
		
		int flag = n-1;
		for (int i = 1; i <= n; i++) {
			if(i>2)
				flag--;
			
			//left
			for (int j = 1; j <= n-1; j++) {
				if(j<=flag)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
				
			
			//middle
			if(i==1)
				System.out.print(n+" ");
			else {
				if(space == 1)
					System.out.print("  ");
				if(space > 1) {
					for (int s = 1; s <= space; s++) {
						System.out.print("  ");
					}
				}
			}
			
			/*//middle
			if(i==1) {
				if(space==1)
					System.out.print(n+" ");
				if(space > 1) {
					System.out.print(n+"");
					for (int s = 1; s <= space; s++) {
						System.out.print(" ");
					}
				}
			}*/
				
			
			//right
			for (int k = n-1; k >= 1; k--) {
				if(k>flag)
					System.out.print("  ");
				else
					System.out.print(k+" ");
			}
			System.out.println();
			
		}
	}

}
