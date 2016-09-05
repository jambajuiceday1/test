package coursera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class string_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "car", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching" };
		check(array);

	}

	private static void check(String[] string) {
		List<String> array = Arrays.asList(string);
		for (int i = 0; i < array.size(); i++) {
			compare(i, array.get(i), array);
			
						
			
		}
	}

	private static void compare(int count, String string, List<String> array) {

		String temp = string;
		char[] charArray = string.toCharArray();
		
		Arrays.sort(charArray);
		
		for (int i = count; i < array.size(); i++) {
			String temp2 = single[count];
		}
	}

}
