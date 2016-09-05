package arrays_strings_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution17_letter_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "23";
		letterCombination(str);

	}

	private static void letterCombination(String str) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(0, "");
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < str.length(); i++) {
			int first = str.charAt(0);
			
		}

	}

}
