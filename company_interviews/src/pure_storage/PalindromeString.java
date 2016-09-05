package pure_storage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PalindromeString {

	public static void main(String[] args) {
		String pal = "geeg";
		Set<String> set = findPalindrome(pal);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static Set<String> findPalindrome(String str) {

		final Set<String> set = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			subset(i, str, set);
		}

		return set;

	}

	private static void subset(int i, String str, final Set<String> set) {

		for (int j = i; j <= str.length(); j++) {
			StringBuilder sb = new StringBuilder();
			sb.append(str.substring(i, j));

			int x = 0;
			int y = sb.toString().length() - 1;
			boolean flag = true;
			while (x < y) {
				if (sb.toString().charAt(x) == sb.toString().charAt(y)) {

				} else {
					flag = false;
				}
				x++;
				y--;

			}

			if (flag == true) {
				set.add(sb.toString());
			}
		}

	}

}
