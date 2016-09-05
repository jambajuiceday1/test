package practice;

public class charcater_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(missingChar("Vishal", 1));
	}

	public static String missingChar(String str, int n) {

		char[] array = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (i != n)
				sb.append(array[i]);
		}

		return sb.toString();

	}

}
