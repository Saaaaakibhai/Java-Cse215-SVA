package LAB05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		System.out.println("Enter 10 integer numbers:");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		
		System.out.println("\nReverse:");
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println(num[i]);
		}

		input.close();
	}

}
