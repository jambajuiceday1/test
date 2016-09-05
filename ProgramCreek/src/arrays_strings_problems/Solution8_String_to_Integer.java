package arrays_strings_problems;

public class Solution8_String_to_Integer {

	public static void main(String[] args) {

		String first = "+-2";
		stringToInt(first);
	}

	private static int stringToInt(String str) {

		String string = str.trim();
		if (string == null || string.length() < 1)
			return 0;
		double res = 0;
		String flag;
		int count = 0;
		
		flag = "";
		if (string.startsWith("-")) {
			flag = "-";
			count++;
		}
		for (int i = count; i < string.length(); i++) {
			if(string.charAt(i)  >= '0' && string.charAt(i) <= '9')
			res = res * 10 + string.charAt(i) - '0';
		}
		if (flag == "-")
			res = -res;
		System.out.println(res);

		if (res > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (res < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int) res;
	}

}
