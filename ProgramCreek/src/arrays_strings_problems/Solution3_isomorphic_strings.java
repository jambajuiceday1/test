package arrays_strings_problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.

//For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.

public class Solution3_isomorphic_strings {

	public static void main(String[] args) {
		String string1 = "aab";
		String string2 = "xxy";
		System.out.println(isIsomorphic(string1, string2));

	}

	private static boolean isIsomorphic(String string1, String string2) {

		if (string1.length() != string2.length())
			return false;
		if (string1 == null || string2 == null)
			return false;

		StringBuilder sb = new StringBuilder();
		Map<Character, Character> set = new HashMap<Character, Character>();
		for (int i = 0; i < string1.length(); i++) {

			char one = string1.charAt(i);
			char two = string2.charAt(i);

			if (set.containsKey(one)) {
				if (set.get(one) != two)
					return false;
			} else {
				if (set.containsValue(two))
					return false;
				set.put(one, two);
			}
		}

		return true;

	}

}
