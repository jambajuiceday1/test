package array.and.strings;

//Given two strings, write a method to decide if one is a permutation of the other
public class One_point_three {

	public static void main(String[] args) {

		String str1 = "vishalk";
		String str2 = "vishalg";
		System.out.println("String are " + check_permutation(str1, str2));

	}

	@SuppressWarnings({ "unused" })
	private static boolean check_permutation(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		} else {
			boolean[] flags = new boolean[1000];
			for (int i = 0; i < str1.length(); i++) {

				int x = str1.charAt(i);
				flags[x] = true;
			}

			for (int j = 0; j < str2.length(); j++) {
				int y = str2.charAt(j);
				boolean flag = true;
				if (flags[y] == true)
					flag = true;
				else
					return false;

			}
		}

		return true;
	}

}
