package random;

public class Pangram {

	public static void main(String[] args) {
		String str1 = "We promptly judged antique ivory buckles for the next prize";
		System.out.println(pangram(str1.toLowerCase()));
		String str2 = "We promptly judged antique ivory buckles for the prize";
		System.out.println(pangram(str2.toLowerCase()));
		String str3 = "Jack amazed a few girls by dropping the antique onyx vase!";
		System.out.println(pangram(str3.toLowerCase()));
	}

	private static boolean pangram(String str) {

		boolean flag = true;
		for (char i = 'a'; i < 'z'; i++) {
			if (str.indexOf(i) == -1) {
				flag = false;
				break;
			}

		}
		return flag ? true : false;

	}

}