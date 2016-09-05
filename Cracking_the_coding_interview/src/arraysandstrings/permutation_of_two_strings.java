package arraysandstrings;

import java.util.Arrays;
import java.util.Collections;

import javax.naming.ldap.SortControl;

//Given two strings, write a method to decide if one is a permutation of the other
public class permutation_of_two_strings {

	public static void main(String[] args) {

		String string1 = "abcdef";
		String string2 = "abcdef";

		System.out.println(check_permutation(string1, string2));
	}

	private static boolean check_permutation(String string1, String string2) {
	
		if (string1.length() != string2.length()) {
			return false;
		}
		
	  char[] set1 = string1.toCharArray();
	  char[] set2 = string2.toCharArray();
	  
	  Arrays.sort(set1);
	  Arrays.sort(set2);
	  String s1 = new String(set1);
	  String s2 = new String(set2);
	  
	return s1.equals(s2);
	}

	/*private static boolean check_permutation(String string1, String string2) {

		if (string1.length() != string2.length()) {
			return false;
		}
		boolean[] char_set = new boolean[256];
		boolean flag = true;
		int x;
		for (int i = 0; i < string1.length(); i++) {
			x = string1.charAt(i);

			if (char_set[x] == false)
				char_set[x] = true;

		}

		int y;
		for (int j = 0; j < string2.length(); j++) {
			y = string2.charAt(j);

			if (char_set[y] == true) {
				flag = true;
			} else
				return false;

		}

		return true;

	}*/

}
