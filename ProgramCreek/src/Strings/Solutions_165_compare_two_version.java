package Strings;

public class Solutions_165_compare_two_version {

	public static void main(String[] args) {

		System.out.println(compare("1", "1.0"));
	}

	private static int compare(String string, String string2) {

		String[] str1 = string.split("\\.");
		String[] str2 = string2.split("\\.");

		int i = 0;
		int j = 0;

		while (i < str1.length && i < str2.length) {

			if (Integer.parseInt(str1[i]) < Integer.parseInt(str2[i])) {
					return -1;
			}
			else if(Integer.parseInt(str1[i]) > Integer.parseInt(str2[i]))
				return 1;
			else
				return 0;
		}
		return j;
	}

}
