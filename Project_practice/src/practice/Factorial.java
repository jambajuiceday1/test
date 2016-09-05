package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(factorial(number));
	}

	private static int factorial(int number) {
		// TODO Auto-generated method stub
		
		if(number == 0)
			return 1;
		else
			return (number) * factorial(number - 1);
		
	}

}
