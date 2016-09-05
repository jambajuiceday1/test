package practice;

public class Int_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 123456;
		System.out.println("res:" + toString(x));

	}

	private static String toString(int x) {
		// TODO Auto-generated method stub

		StringBuilder result = new StringBuilder();
		int mod = 0;
		int divide = 0;

		divide = x / 10;
		while (divide > 0) {
			mod = x % 10;
			divide = x / 10;
			result.append(mod);
			x = divide;

		}
		return result.reverse().toString();

	}

}
