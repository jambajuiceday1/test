package Equilar;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 1; i <= Integer.MAX_VALUE; i++) {
		// System.out.println(fibonacci(i));
		// }

		System.out.println(fibonacciItearative(20));
	}

	private static int fibonacciItearative(int number) {

		if (number == 1 || number == 2)
			return 1;
		int fibo1 = 1, fibo2 = 1, fibo3 = 2;
		int add = 0;
		for (int j = 3; j <= number; j++) {
			fibo3 = fibo1 + fibo2;
			System.out.println(fibo3);
			fibo1 = fibo2;
			fibo2 = fibo3;
		}
		
		return fibo3;

	}

	private static int fibonacci(int i) {

		if (i == 1 || i == 2)
			return 1;
		return fibonacci(i - 1) + fibonacci(i - 2);

	}

}
