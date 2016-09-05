package zillow;


import java.security.InvalidParameterException;

public class zillow_Stirng_to_int {
	static int ans = 0;

	public static void main(String args[]) {

		String str = "+454";
		convert(str);
		System.out.println(ans);
	}

	public static int convert(String s) {
		if (s == null || s.length() == 0) {
			throw new InvalidParameterException();
		}
		

		int ret = 0;

		boolean isNegtive = false, isPositive = true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (i == 0 && (c == '-')) {
				isNegtive = true;
				continue;
			}
			if (i == 0 && (c == '+')) {
				isPositive = true;
				continue;
			}

			if (c - '0' < 0 || c - '0' > 10) {
				throw new InvalidParameterException();
			}

			int tmp = c - '0';
			int t = '0';
			System.out.println(t);

			ret *= 10;
			ret += tmp;

		}

		if (isNegtive) {
			ans = (ret - ret * 2);
		} else if (isPositive) {
			ans = ret;
		} else {
			ans = ret;
		}
		return ans;

	}

	/*
	 * static int strToInt(String s) { int i = 0; int num = 0; // String str;
	 * int len = s.length(); boolean isNegative = false; boolean isPositive =
	 * false; char[] str = s.toCharArray();
	 * 
	 * if (str[0] == '-') { isNegative = true; i = 1; }
	 * 
	 * if (str[0] == '+') { isPositive = true; i = 1; }
	 * 
	 * while (i < len) { num *= 10; num += (str[i++] - '0'); }
	 * 
	 * if (isNegative) { num *= -1; } if (isPositive) { num = num * 1; }
	 * 
	 * System.out.println(num);
	 * 
	 * return num; }
	 */
}