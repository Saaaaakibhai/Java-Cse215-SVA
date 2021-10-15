package QUIZ;

import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter age: ");
			int n = input.nextInt();
			
			validate(n);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}

	}
	
	public static void validate(int age) {
		if(age<20 || age>70)
			throw new ArithmeticException("Invalid!");
		else
			System.out.println("Valid!");
	}

}
